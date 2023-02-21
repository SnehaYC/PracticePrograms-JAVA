// Program to divide two numbers.

//------------------------------------------------------------------------
// Header file and Macros
//------------------------------------------------------------------------
import java.util.Scanner;

//-------------------------------------------------------------------------
// Function Name : Divide
// Input         : Integer
// Output        : Integer
// Description   : This function is used to divide one number from another.
// Author        : Sneha Yogesh Choudhari
//-------------------------------------------------------------------------

class Number
{
	public
	
	int Divide(int iNo1, int iNo2)
	{
		int iAns = 0;
		if(iNo2 < 0)
		{
			return -1;
		}
		iAns = iNo1 / iNo2;
		return iAns;
	}
}


//------------------------------------------------------------------
// Entry point function
//------------------------------------------------------------------
class Program_5
{
	public static void main(String arg[])
	{
		int iValue1 = 15, iValue2 = 5;
		int iRet = 0;
	 
		Number obj = new Number();
		
		iRet = obj.Divide(iValue1,iValue2);
		
		System.out.print("Division is: "+iRet);
		
	} 
	
}
