// Accept one number from user and print that number of * on screen.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Display
// Description   : This function is used to accpt number and 
//                 display the content using for loop.
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	void Accept(int iNo)
	{
		int iCnt ;
		for(iCnt = 0; iCnt<iNo; iCnt++)
		{
			System.out.print("*\t");
		}
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_9
{
	public static void main(String b[])
	{
		int iValue = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		
		obj.Accept(iValue);
	}
	
}

