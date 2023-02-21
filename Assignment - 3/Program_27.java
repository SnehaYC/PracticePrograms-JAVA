// Accept number from user and display below pattern. 
// Input : 5 
// Output : A B C D E  

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: DisplayPattern
// Input        : Integer
// Output       : Integer
// Discription  : This function Accept number from user and 
//                display pattern. 
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Pattern
{
	public
	
	void DisplayPattern(int iNo) 
	{ 
		char ch = 'A';
		int iCnt = 0;
		
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			System.out.print(ch + " ");
			ch++;
		}
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_27
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


