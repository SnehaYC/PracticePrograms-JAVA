// Write a program which accept N and print first 5 multiples of N. 
// Input : 4 
// Output : 4 8 12 16 20 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : OddDisplay
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept N and print 
//                 first 5 multiples of N.
// Author        : Sneha Yogesh Choudhari
//---------------------------------------------------------- 

class Number
{
	public
	void OddDisplay(int iNo) 
	{ 
		int iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iCnt = 1; iCnt <= 5; iCnt++)
		{
			System.out.print(iCnt * iNo + " ");
		}
	} 
}

class Program_19
{
	public static void main(String[] arg) 
	{ 
		int iValue = 0; 
	 
		System.out.print("Enter number: "); 
		Scanner in = new Scanner(System.in);
		iValue = in.nextInt();
		
		Number obj = new Number();
		obj.OddDisplay(iValue);
	}
}
