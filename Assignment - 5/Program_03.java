// Accept number from user and return its reverse number.
// Input : 7521
// Output : 1257
// Input : 4502
// Output : 2054
// Input : 7500
// Output : 57

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Reverse
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                its reverse number.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int Reverse(int iNo)
	{
		int iDigit = 0, iRev = 0;
		if(iNo < 0)
		{iNo = -iNo;}
		
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			iRev = (iRev * 10) + iDigit;
			iNo = iNo / 10;
		}
		return iRev;
	}
}

//---------------------------------------------------------
//Entry Point Function
//--------------------------------------------------------
class Program_03
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.Reverse(iValue);
		
		System.out.print("Reverse number is: " + iRet);
	}
}




