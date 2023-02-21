//3. Accept number from user if number is less than 10 then print
//Hello otherwise print Demo.

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Description  : This function Accept number from user if numbers  
//                less than 10 then print Hello otherwise print Demo. 
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Number
{
	public
	
	void Display(int iNo)
	{
		if(iNo < 10)
		{
			System.out.print("Hello");
		}
		else
		{	
			System.out.print("Demo");
		}
	}
}


//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program_10
{
	public static void main(String d[])
	{
		int iValue = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		obj.Display(iValue);
	}
}
