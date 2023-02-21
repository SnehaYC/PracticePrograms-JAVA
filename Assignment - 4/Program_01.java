/* Write a program which accept range from user and display all numbers in between 
that range. 
Input : 23 35 
Output : 23 24 25 26 27 28 29 30 31 32 33 34 35 
Input : 10 18 
Output : 10 11 12 13 14 15 16 17 18 
Input : 10 10 
Output : 10 
Input : -10 2 
Output : -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 
Input : 90 18 
Output : Invalid range
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: RangeDisplay
// Input        : Integer
// Output       : Integer
// Discription  : This function accept range from user and 
//                display all numbers in between that range.  
// Date         : 13/04/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Range
{
	public
	
	void RangeDisplay(int iStart , int iEnd) 
	{ 
		int iSum = 0,iCnt = 0;
		
		if(iStart > iEnd)
		{
			System.out.print("Invalid range");
		}
		for (iCnt = iStart; iCnt <= iEnd;iCnt++)
		{
			System.out.print(" " + iCnt);
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_01
{
	public static void main(String b[])
	{
		int iValue1, iValue2 = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting point: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter ending point: ");
		iValue2 = in.nextInt();
		
		Range obj = new Range();
		
		obj.RangeDisplay(iValue1,iValue2);
	
	}
	
}


