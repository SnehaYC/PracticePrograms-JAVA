// Accept number from user and return difference between largest and smallest digit.
// Input : 89451
// Output : 8   (9-1)
// Input : 5672
// Output : 5 (7 - 2)
// Input : 2222
// Output : 0 ( 2 - 2)
//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: MaxMin
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and difference 
//                between largest and smallest digit.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	int MaxMin(int iNo)
	{
		int iMax = 0, iMin = 9, iDigit = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		if(iNo == 0)
		{
			return 0;
		}
		while(iNo > 0)
		{
			iDigit = iNo % 10;
			if(iDigit > iMax)
			{
				iMax = iDigit;
			}
			if(iDigit < iMin)
			{
				iMin = iDigit;
			}
			iNo = iNo / 10;
		}
		return iMax - iMin;
	}

}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_07
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		iRet = obj.MaxMin(iValue);
		
		System.out.print("Diffrence is : " + iRet);	
	}
}


