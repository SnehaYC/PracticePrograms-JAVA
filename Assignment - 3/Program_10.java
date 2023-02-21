/* Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 3 iCol = 4 
Output : 
		 1  2   3  4 
		 5  6   7  8 
		 9  10  11 12  
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
		int iCnt1 , iCnt2 = 0 , iCnt = 1;
		
		for(iCnt1 = 1; iCnt1 <= iRow; iCnt1++)
		{
			for(iCnt2 = 1; iCnt2 <= iCol; iCnt2++,iCnt++)
			{
				System.out.print(iCnt + " ");
			}
			System.out.println();
		}
	} 
}


//----------------------------------------------------------
// Entry point function
//---------------------------------------------------------
class Program_10
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


