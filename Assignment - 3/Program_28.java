// Accept number from user and display below pattern. 
// Input : 5 
// Output : 5 # 4 # 3 # 2 # 1 # 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: DisplayPattern
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from user and 
//                display pattern.
// Date         : 13/04/2022
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
		
		for(iCnt = iNo; iCnt >= 1 ; iCnt--)
		{
			System.out.print(iCnt);
			System.out.print(" # ");
		}
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_07
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


