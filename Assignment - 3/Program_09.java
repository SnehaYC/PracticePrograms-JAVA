/* Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 5 
Output : 
		 4 4 4 4 4 
		 3 3 3 3 3 
		 2 2 2 2 2 
		 1 1 1 1 1 
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
		
		for(iCnt1 = iRow; iCnt1 >= 1; iCnt1--)
		{
			for(iCnt2 = 1; iCnt2 <= iCol; iCnt2++)
			{
				System.out.print(iCnt1 + " ");
			}
			System.out.println();
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//---------------------------------------------------------
class Program_09
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


