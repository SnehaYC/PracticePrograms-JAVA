// Accept number from user and return multiplication of digits.
// Input : 7521
// Output : 70
// Input : 4502
// Output : 40

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: MultDigit
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                multiplication of digits.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int MultDigit(int iNo)
	{
		int iDigit = 0, iMult = 1;
		if(iNo < 0)
		{   iNo = -iNo; }
		if(iNo == 0)
		{ return 0;}
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			if(iDigit != 0)
			{
				iMult = iMult * iDigit;
			}
			iNo = iNo / 10;
		}
		return iMult;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_08
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.MultDigit(iValue);
		
		System.out.print("Multiplication of digits: " + iRet);
	}
}






