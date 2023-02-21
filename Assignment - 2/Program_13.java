// Write a program which accept number from user and return the count of digits in 
// between 3 and 7. 
// Input : 2395 
// Output : 1 
// Input : 1018 
// Output : 0 
// Input : 4521 
// Output : 2 
// Input : 9922 
// Output : 0 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : CountOdd
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user and 
//                 return the count of digits in between 3 and 7. 
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	int CountOdd(int iNo)
	{
		int iDigit = 0, iCnt = 0 ;
		
		while(iNo>0)
		{
			iDigit = iNo%10;
			if((iDigit > 3) && (iDigit < 7))
			{
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_13
{
	public static void main(String b[])
	{
		int iRet = 0;
		int iValue = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = SC.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.CountOdd(iValue);
		
		System.out.print(iRet);
	}
	
}

