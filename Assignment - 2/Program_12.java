// Write a program which accept number from user and return the count of odd digits. 
// Input : 2395 
// Output : 3 
// Input : 1018 
// Output : 2 
// Input : -1018 
// Output : 2 
// Input : 8462 
// Output : 0

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : CountEven
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from 
//                 user and return the count of odd digits. 
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	int CountEven(int iNo)
	{
		int iDigit = 0, iCnt = 0 ;
		
		while(iNo>0)
		{
			iDigit = iNo%10;
			if((iDigit%2) != 0)
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
class Program_12
{
	public static void main(String b[])
	{
		int iRet = 0;
		int iValue = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = SC.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.CountEven(iValue);
		
		System.out.print(iRet);
	}
	
}

