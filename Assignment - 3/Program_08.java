/*  Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 3 iCol = 5 
Output : 
		 A A A A A 
		 B B B B B 
		 C C C C C 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: DisplayPattern
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number of rows and number
//                of columns from user and display given pattern.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Pattern
{
	public
	
	void DisplayPattern(int iRow , int iCol) 
	{ 
		int iCnt1 , iCnt2 = 0;
		char ch = 'A';
		
		
		for(iCnt1 = 1; iCnt1 <= iRow; iCnt1++)
		{
			for(iCnt2 = 1; iCnt2 <= iCol; iCnt2++)
			{
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//---------------------------------------------------------
class Program_08
{
	public static void main(String b[])
	{
		int iValue1, iValue2 = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter number of columns: ");
		iValue2 = in.nextInt();
		
		Pattern obj = new Pattern();
		
		obj.DisplayPattern(iValue1,iValue2);
	
	}
	
}


