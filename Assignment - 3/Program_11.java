// Write a program which accept number from user and print that number of $ & * 
// on screen. 
// Input : 5 
// Output : $ * $ * $ * $ * $ * 
// Input : 3 
// Output : $ * $ * $ * 
// Input : -3 
// Output : $ * $ * $ * 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : Pattern
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user  
//                 and print that number of $ & * on screen. 
// Author        : Sneha Yogesh Choudhari
//---------------------------------------------------------- 

class Pattern
{
	public
	void Pattern1(int iNo) 
	{ 
		int iRow = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iRow = 1; iRow <= iNo; iRow++)
		{
			System.out.print("$ \t");
			System.out.print("* \t");
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_11
{
	public static void main(String[] arg) 
	{ 
		int iValue = 0; 
	 
		System.out.print("Enter number: "); 
		Scanner in = new Scanner(System.in);
		iValue = in.nextInt();
		
		Pattern obj = new Pattern();
		obj.Pattern1(iValue);
	}
}
