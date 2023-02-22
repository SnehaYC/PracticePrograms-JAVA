/* Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 5 iCol = 5 
Output : 
		  1 1 1 1 1
		  3 _ _ _ 3
		  5 _ _ _ 5
		  7 _ _ _ 7
		  9 9 9 9 9  
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number of rows and number
//                of columns from user and display pattern. 
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Pattern
{
	public
	
	void Display(int iRow, int iCol)
	{
		int no = 1;
		for(int i = 1; i <= iRow; i++)
		{
			for(int j = 1; j<=iCol; j++)
			{
				if((i == 1) || (j == 1) || (i == iRow) || (j == iCol))
				{
					System.out.print(no+"\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			no = no + 2;
			System.out.println();
		}
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_32
{
	public static void main(String b[])
	{
		int iValue1 = 0, iValue2 = 0; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of rows: "); 
		iValue1 = in.nextInt(); 
		
		System.out.print("Enter number of columns: "); 
		iValue2 = in.nextInt(); 
		
		Pattern obj = new Pattern();
		obj.Display(iValue1,iValue2);
	}
	
}


