// Write a program which accept number from user and return multiplication of all 
// digits. 
// Input : 2395 
// Output : 270 
// Input : 1018 
// Output : 0 
// Input : 9441 
// Output : 144 
// Input : 922432 
// Output : 864

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : MultDigit
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user 
//                 and return multiplication of all digits. 
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	int MultDigit(int iNo)
	{
		int iDigit = 0, iMult = 1 ;
		
		if(iNo<0)
		{
			iNo = -iNo;
		}
		while(iNo>0)
		{
			iDigit = iNo%10;
			iMult = iMult * iDigit;
			iNo = iNo/10;
		}
		return iMult;
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_04
{
	public static void main(String b[])
	{
		int iRet = 0;
		int iValue = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = SC.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.MultDigit(iValue);
		
		System.out.print(iRet);
	}
	
}

