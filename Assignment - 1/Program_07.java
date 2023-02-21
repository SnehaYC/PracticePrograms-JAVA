// Program to print 5 to 1 numbers on screen.

//-----------------------------------------------------------
// Imports
//-----------------------------------------------------------
import java.util.Scanner;

//-----------------------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number and 
//                 display 5 to 1 numbers on screen.
// Author        : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Number
{
	public
	void Display()
	{  
		int i; 
		for(i = 5;i >= 1;i--)
		{
			System.out.print(i+"\t");
		}
	}
}


//-----------------------------------------------------------
// Entry Point Function
//-----------------------------------------------------------
class Program_7
{
	public static void main(String arg[])
	{
		Number obj = new Number();
		obj.Display();
	}
}
