/* Write a program which accept accept range from user and display all numbers in 
between that range in reverse order. 
Input : 23 35 
Output : 35 34 33 32 31 30 29 28 27 26 25 24 23 
Input : 10 18 
Output : 18 17 16 15 14 13 12 11 10 
Input : 10 10 
Output : 10 
Input : -10 2 
Output : 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
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
// Discription  : This function accept range from user and return 
//                addition of all even numbers in between that range.
// Date         : 13/04/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Range
{
	public
	
	void RangeDisplayRev(int iStart , int iEnd) 
	{ 
		int iSum = 0,iCnt = 0;
		
		if(iStart > iEnd)
		{
			System.out.print("Invalid range.");
		}
		for (iCnt = iEnd ; iCnt >= iStart;iCnt--)
		{
			System.out.print(" " + iCnt);
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_05
{
	public static void main(String b[])
	{
		int iValue1, iValue2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting point: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter ending point: ");
		iValue2 = in.nextInt();
		
		Range obj = new Range();
		
		obj.RangeDisplayRev(iValue1,iValue2);
	}
	
}


