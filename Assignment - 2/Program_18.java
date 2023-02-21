// Write a program which accepts N from user and print all odd numbers up to N. 
// Input : 18 
// Output : 1 3 5 7 9 11 13 15 17 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept N from  
//                 user and print all odd numbers up to N. 
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
		
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if((iCnt%2) != 0)
			{
				System.out.print(iCnt + " ");
			}
		}
	} 
}

class Program_18
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
