//Accept number from user and print numbers up to that number. 

//-----------------------------------------------------------
// Header file 
//-----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Integer
// Description   : This funtion display the numbers.
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------

class Number
{
	public
	
	void Display(int iNo)
	{
		int iCnt = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
       
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			System.out.println(iCnt);   
		}
	}
	
}

//-----------------------------------------------------------
// Entry Point Function
//-----------------------------------------------------------

class Program_2
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number:");
		int iValue = scn.nextInt();
		
		Number obj = new Number();

		obj.Display(iValue);   

	}
}

