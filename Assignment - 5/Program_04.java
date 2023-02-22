// Accept number from user and check whether that number is pallindrom or not
// Input : 7521
// Output : False
// Input : 121
// Output : True
// Input : 75057
// Output : True

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: CheckPallindrome
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and return 
//                its reverse number.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	boolean CheckPallindrome(int iNo)
	{
		int iDigit =0, iRev = 0, iTemp = 0;
		if(iNo < 0)
		{   iNo = -iNo; }
		iTemp = iNo;
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			iRev = (iRev * 10) + iDigit;
			iNo = iNo / 10;
		}
		if(iRev == iTemp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_04
{
	public static void main(String arg[])
	{
		int iValue = 0;
		boolean bRet = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		bRet = obj.CheckPallindrome(iValue);
		
		if(bRet == true)
		{
			System.out.print("It is pallindrome.\n");
		}
		else
		{
			System.out.print("It is not pallindrome.\n");
		}
	}
}








