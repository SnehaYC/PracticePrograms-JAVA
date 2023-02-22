// Accept number from user and display the factors in reverse order.

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Factors
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and display the 
//                factors in reverse order..
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	void Factors(int iNo)
	{
		int iCnt = 0;
		if(iNo < 0)
		{iNo = -iNo;}
	
		for(iCnt = iNo/2; iCnt >=1; iCnt--)
		{
			if((iNo % iCnt) == 0)       
			{
				System.out.print(" " + iCnt);
			}
		}
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_19
{
	public static void main(String arg[])
	{
		int iValue = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		obj.Factors(iValue);
			
	}
}





