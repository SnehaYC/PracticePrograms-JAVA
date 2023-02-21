/* Write a program which accept range from user and return addition of all even 
numbers in between that range. (Range should contains positive numbers only) 
Input : 23 30 
Output : 108 
Input : 10 18 
Output : 70 
Input : -10 2 
Output : Invalid range 
Input : 90 18 
Output : Invalid range 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: RangeSumEven
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
	
	int RangeSumEven(int iStart , int iEnd) 
	{ 
		int iSum = 0,iCnt = 0;
		
		if(iStart >= iEnd) 
		{
			System.out.print("Invalid range");
		}
		if(iStart < 0)
		{
			System.out.print("Invalid range");
		}
		
		for (iCnt = iStart; iCnt <= iEnd;iCnt++)
		{
			if((iCnt%2)==0)
			{
				iSum = iSum + iCnt;
			}
		}
		return iSum;
	} 
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_04
{
	public static void main(String b[])
	{
		int iValue1, iValue2 , iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter starting point: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter ending point: ");
		iValue2 = in.nextInt();
		
		Range obj = new Range();
		
		iRet = obj.RangeSumEven(iValue1,iValue2);
		
		System.out.print(iRet);
	
	}
	
}


