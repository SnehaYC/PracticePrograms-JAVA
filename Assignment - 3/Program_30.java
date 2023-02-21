// Accept number from user and display below pattern. 
// Input : 4 
// Output : # 1 * # 2 * # 3 * # 4 *

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: DisplayPattern
// Input        : Integer
// Output       : Integer
// Discription  : This function accept Accept number from user 
//                and display pattern.
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
			System.out.print(" # ");
			System.out.print(iCnt);
			System.out.print(" * ");
		}
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_30
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


