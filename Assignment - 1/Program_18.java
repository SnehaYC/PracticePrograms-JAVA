// Accept number from user and return the difference between
// numbers diviser and non-diviser.
// 10
// 18 - 37 (1 + 2 + 5 + 10)- (3 + 4 + 6 + 7 + 8 + 9)
// -19

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Diffrence
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                between numbers diviser and non-diviser.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int Diffrence(int iNo)
	{
		int iCnt = 0, iSum1 = 0, iSum2 = 0;
		if(iNo < 0)
		{iNo = -iNo;}
		
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if((iNo % iCnt) == 0)
			{
				iSum1 = iSum1 + iCnt;
			}
			else
			{
				iSum2 = iSum2 + iCnt;
			}
		}
		return iSum1 - iSum2;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_18
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.Diffrence(iValue);
		
		System.out.print("Diffrence is:" + iRet);
		
	}
}









