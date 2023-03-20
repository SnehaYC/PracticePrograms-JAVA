// Write a program to print matrix on screen using package.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;
import Marvellous.Matrix;

//----------------------------------------------------------
// Description : This function accept row and columns from user 
//               and with the help of matrix package display the matrix.
// Entry point function
//----------------------------------------------------------
class Program_04
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns: ");
		int col = sobj.nextInt();

		Matrix mobj = new Matrix(row,col);
		mobj.Accept();
		mobj.Display();
		
		System.gc();
	}
}


