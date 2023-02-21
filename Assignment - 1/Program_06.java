//Program to print 5 times Marvellous on screen.

//---------------------------------------------------------------------------
// Imports 
//---------------------------------------------------------------------------
import java.util.Scanner;

//---------------------------------------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Integer
// Description   : This function is use to print 5 times Marvellous on screen.
// Author        : Sneha Yogesh Choudhari
//----------------------------------------------------------------------------

class Number
{
	public
	
	void Display()
	{
		int i = 0;
		for(i = 1; i<= 5;i++)
		{
			System.out.println("Marvellous");
		}
	}
}


//------------------------------------------------------------------
// Entry point function
//------------------------------------------------------------------
class Program_6
{
	public static void main(String arg[])
	{
		Number obj = new Number();
		
		obj.Display();
		
	}
}
