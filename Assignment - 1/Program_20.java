// Write a program to accept two numbers from user and perform addition on them and print result on screen.

//---------------------------------------------------------
// Imports
//---------------------------------------------------------

import java.util.Scanner;

//---------------------------------------------------------
// Function Name: Factors
// Input        : Integer
// Output       : Integer
// Description  : This function accept number and display the 
//                addition of two number
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Mathematics
{
	int Addition(int x, int y)
	{
		return x+y;
	}
}

//---------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------
class Program20
{
	public static void main(String arg[])
	{
		int no1,no2,ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		Mathematics mobj = new Mathematics();
		ans = mobj.Addition(no1,no2);
		
		System.out.println("Addition is : "+ans);
	}
}





