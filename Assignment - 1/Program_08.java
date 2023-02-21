// Accept one number and check whether it is divisible by 5 or not.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------

import java.util.Scanner;

//-----------------------------------------------------------------
// Function Name : Check
// Input         : Integer
// Output        : Integer
// Description   : This function is use to check whether the given
//                 input number is divisible by 5 or not.
// Author        : Sneha Yogesh Choudhari
//-----------------------------------------------------------------

class Number
{
	public
	
	boolean Check(int iNo)
	{
		if((iNo % 5) == 0)
		{
			return true;
		}
		else
		{
			return false ;
		}
	}
}


//------------------------------------------------------------------
// Entry point function
//------------------------------------------------------------------

class Program_8
{
	public static void main(String a[])
	{
		int iValue = 0;
		boolean bRet = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		bRet = obj.Check(iValue);
		
		if(bRet == true)
		{
			System.out.print(iValue +" is divisible by 5.");
		}
		else
		{
			System.out.print(iValue + " is not divisible by 5.");
		}
		
	}
}
