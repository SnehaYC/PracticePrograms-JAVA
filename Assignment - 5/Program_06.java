// Accept number from user and return the smallest digit
// Input : 7526
// Output : 2
// Input : 101
// Output : 0
// Input : 58902
// Output : 0

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: MinDigit
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                the smallest digit.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int MinDigit(int iNo)
	{
		int iDigit = 0, iMin = 9;
		if(iNo < 0)
		{iNo = -iNo;}
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			if(iDigit < iMin)
			{
				iMin = iDigit;
				if(iMin == 0)
				{
					break;
				}
			}
			iNo = iNo / 10;
		}
		return iMin;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_06
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.MinDigit(iValue);
		
		System.out.print("Smallest digit is:" + iRet);
		
	}
}










