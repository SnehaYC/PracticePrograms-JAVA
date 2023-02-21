/* Write a program which accept range from user and return addition of all numbers 
in between that range. (Range should contains positive numbers only) 
Input : 23 30 
Output : 212 
Input : 10 18 
Output : 126 
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
// Function Name: RangeSum
// Input        : Integer
// Output       : Integer
// Discription  : This funtion accept range from user and and return 
//                addition of all numbers in between that range.  
// Date         : 13/04/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Range
{
	public
	
	int RangeSum(int iStart , int iEnd) 
	{ 
		int iSum = 0,iCnt = 0;
		
		if(iStart >= iEnd) 
		{
			return -1;
		}
		if(iStart < 0)
		{
			return -1;
		}
		
		for (iCnt = iStart; iCnt <= iEnd;iCnt++)
		{
			iSum = iSum + iCnt;
		}
		return iSum;
	} 
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_03
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
		
		iRet = obj.RangeSum(iValue1,iValue2);
		
		System.out.print(iRet);
	
	}
	
}


