// Write a program which accept number from user and print its numbers line. 
// Input : 4 
// Output : -4 -3 -2 -1 0 1 2 3 4

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name : Display
// Input         : Integer
// Output        : Integer
// Description   : This function is used to accept number from user  
//                 and print its numbers line. 
// Author        : Sneha Yogesh Choudhari
//---------------------------------------------------------- 

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
		
		for(iCnt = -iNo; iCnt <= iNo; iCnt++)
		{
			System.out.print(iCnt + " ");
		}
		
	} 
}

class Program_17
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
