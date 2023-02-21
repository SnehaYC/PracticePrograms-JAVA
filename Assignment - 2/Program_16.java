// Write a program which accept number from user and print numbers till that 
// number. 
// Input : 8 
// Output : 1 2 3 4 5 6 7 8

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : Pattern
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user  
//                 and print numbers till that number.  
// Author        : Sneha Yogesh Choudhari
//---------------------------------------------------------- 

class Pattern
{
	public
	void Display(int iNo) 
	{ 
		int iRow = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iRow = 1; iRow <= iNo; iRow++)
		{
			System.out.print(iRow + " ");
		} 
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_16
{
	public static void main(String[] arg) 
	{ 
		int iValue = 0; 
	 
		System.out.print("Enter number: "); 
		Scanner in = new Scanner(System.in);
		iValue = in.nextInt();
		
		Pattern obj = new Pattern();
		obj.Display(iValue);
	}
}
