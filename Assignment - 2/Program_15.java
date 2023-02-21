// Write a program which accept number from user and return difference between 
// summation of even digits and summation of odd digits. 
// Input : 2395 
// Output : -15 (2 - 17) 
// Input : 1018 
// Output : 6 (8 - 2) 
// Input : 8440 
// Output : 16 (16 - 0) 
// Input : 5733 
// Output : -18 (0 - 18) 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : CountDiff
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user  
//                 and return difference between summation of even 
//                 digits and summation of odd digits.  
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public

	int CountDiff(int iNo)
	{
		int iDigit = 0 , iEven = 0 , iOdd = 0;
		
		if(iNo<0)
		{
			iNo = -iNo;
		}
		
		while(iNo > 0)
		{
			iDigit = iNo%10;
			if((iDigit%2)==0)
			{
				iEven = iEven + iDigit;
			}
			else
			{
				iOdd = iOdd + iDigit;
			}
			iNo = iNo/10;
		}
		return iEven - iOdd;
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_15
{
	public static void main(String b[])
	{
		int iRet = 0;
		int iValue = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.CountDiff(iValue);
		
		System.out.print(iRet);
	}
	
}

