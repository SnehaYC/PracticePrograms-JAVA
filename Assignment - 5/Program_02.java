//Accept number from user and display the summation of digits.
// Input : 7521
// Output :  15     (7+5+2+1)

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: SumDigits
// Input        : Integer
// Output       : Integer
// Description  : This function Accept number from user if numbers  
//                less than 10 then print Hello otherwise print Demo. 
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int SumDigits(int iNo)
	{
		int iDigit = 0, iSum = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		while(iNo > 0)
		{
			iSum = iSum + (iNo % 10);
			iNo = iNo / 10;
		}
		return iSum;
	}
}


//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_02
{
	public static void main(String d[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		iRet = obj.SumDigits(iValue);
		
		System.out.print("Summation of digits: " + iRet);
	}
}



