// Accept number from user and return the largest digit
// Input : 7521
// Output : 7
// Input : 121
// Output : 2
// Input : 56892
// Output : 9

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: MaxDigit
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                the largest digit.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int MaxDigit(int iNo)
	{
		int iDigit = 0, iMax = 0;
		if(iNo < 0)
		{iNo = -iNo;}
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			if(iDigit > iMax)
			{
				iMax = iDigit;
				if(iMax == 9)
				{
					break;
				}
			}
			iNo = iNo / 10;
		}
		return iMax;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_27
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.MaxDigit(iValue);
		
		System.out.print("Largest digit is:" + iRet);
		
	}
}











