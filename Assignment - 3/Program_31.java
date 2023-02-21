// Accept the number from user and display its multiples.
// Input : 8 
// Output : 2 4 6 8 10 12 14 16

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: DisplayPattern
// Input        : Integer
// Output       : Integer
// Discription  : This function accept the number from user 
//                and display its multiples.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Pattern
{
	public
	
	void DisplayPattern(int iNo) 
	{ 
		int iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iCnt = 1; iCnt <= iNo ; iCnt++)
		{
			System.out.print(iCnt * 2 + " ");
		}
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_31
{
	public static void main(String b[])
	{
		int iValue = 0; 
		
		System.out.print("Enter number of elements: "); 
		
		Scanner in = new Scanner(System.in);
		iValue = in.nextInt(); 
		
		Pattern obj = new Pattern();
		obj.DisplayPattern(iValue);
	}
	
}


