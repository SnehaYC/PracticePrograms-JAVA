//Accept number from user and return the count of even digits.
// Input : 4521
// Output :  2
// Input : 8642
// Output : 4
// Input : 7139
// Output : 0

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: EvenDigits
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
//                return the count of even digits. 
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int EvenDigits(int iNo)
	{
		int iDigit = 0, iCnt = 0;
		if(iNo < 0)
		{iNo = -iNo;}
		if(iNo == 0)
		{
			return 1;
		}
		while(iNo > 0)
		{
			if(((iNo %10) % 2) == 0)
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
class Program_10
{
	public static void main(String d[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.EvenDigits(iValue);
		
		System.out.print("Number of even digits are: " + iRet);
	}
}




