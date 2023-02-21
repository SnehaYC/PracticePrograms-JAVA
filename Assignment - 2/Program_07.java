/*2.Write a program which accept number from user and display its factors in decreasing order.
Input  : 12
Output : 6 4 3 2 1
Input  : 13
Output : 1
Input  : 10
Output : 5 2 1
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: FactRev
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and display
//                its factors in decreasing order.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------
class Number
{
	public
	void FactRev(int iNo)
	{     
		int n, revNumber = 0;
		
		for(i = iNo/2; i >= 1 ;i--)
		{
		  if(iNo%i == 0)
			{ 
			   System.out.print(i + "\t");
			}
		}

	}
}



//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------
class Program_07
{
	public static void main(String arg[])
	{
		int iValue = 0;
		 
		Scanner SC = new Scanner(System.in); 
		
		System.out.print("Enter number: ");
		iValue = SC.nextInt();
		
		Number obj = new Number();	
		
		obj.FactRev(iValue);
	}
}

