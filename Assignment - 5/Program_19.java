//Accept number from user and display the digits of that numbers separately in reverse order
// Input : 7521
// Output :   1
//            2
//            5
//            7

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: DisplayDigits
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
//                display the digits of that numbers separately 
//                in reverse order
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	void DisplayDigits(int iNo)
	{
		int iDigit = 0;
		if(iNo < 0)
		{iNo = -iNo;}
		
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			System.out.println(iDigit);
			iNo = iNo / 10;
		}
	}
}


//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_19
{
	public static void main(String d[])
	{
		int iValue = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		obj.DisplayDigits(iValue);
	}
}


