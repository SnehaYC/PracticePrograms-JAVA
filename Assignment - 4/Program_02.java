/* Write a program which accept range from user and display all even numbers in 
between that range. 
Input : 23 35 
Output : 24 26 28 30 32 34 
Input : 10 18 
Output : 10 12 14 16 18 
Input : 10 10 
Output : 10 
Input : -10 2 
Output : -10 -8 -6 -4 -2 0 2 
Input : 90 18 
Output : Invalid range
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: RangeDisplayEven
// Input        : Integer
// Output       : Integer
// Discription  : This function accept range from user and display  
//                all even numbers in between that range.   
// Date         : 13/04/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Range
{
	public
	
	void RangeDisplayEven(int iStart , int iEnd) 
	{ 
		int iSum = 0,iCnt = 0;
		
		if(iStart > iEnd)
		{
			System.out.print("Invalid ra23nge");
		}
		for (iCnt = iStart; iCnt <= iEnd;iCnt++)
		{
			if((iCnt%2)==0)
			{
				System.out.print(" " + iCnt);
			}
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_02
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
		
		obj.RangeDisplayEven(iValue1,iValue2);
	
	}
	
}


