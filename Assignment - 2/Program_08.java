/*3.Write a program which accept number from user and display all its non factors.
Input  : 12
Output : 5 7 8 9 10 11
Input  : 13
Output : 2 3 4 5 6 7 8 9 10 11 12
Input  : 10
Output : 3 4 6 7 8 9
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: NonFact
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
// 				  display all its non factors..
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	void NonFact(int iNo)
	{
		int i;
		for(i=1; i <= iNo; ++i)
		{
		  if(iNo%i != 0)
			{
				System.out.print(i +"\t");
			}
		}
	}
}


//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------

class Program_08
{
	public static void main(String arg[])
	{
		 int iValue = 0;
		 
		 Scanner SC = new Scanner(System.in);
		 
		 System.out.print("Enter number: ");
		 iValue = SC.nextInt();
		 
		 Number obj = new Number();
		 obj.NonFact(iValue);
	}
}
