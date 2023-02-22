// Accept number and one digit from user and return the frequency of that digit.
// Input :  75845   5
// Output :   2
// Input : 89562   1
// Output :   0

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and one digit
//                from user and return the frequency of that digit. 
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int DigitFrequency(int iNo, int i)
	{
		int iDigit = 0, iCnt = 0;
		if(iNo < 0)
		{iNo = -iNo; }
		if((i < 0)||(i > 9))
		{
			System.out.print("Invalid digit\n");
			return 0;
		}
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			if(iDigit == i)
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_22
{
	public static void main(String d[])
	{
		int iValue = 0, iRet = 0, iNo = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		System.out.print("Enter the digit that you want to search:\n");
		iNo = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.DigitFrequency(iValue, iNo);
		
		System.out.print("Number of digits are: " + iRet);
	}
}






