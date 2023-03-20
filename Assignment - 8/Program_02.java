//Write a program to print matrix.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Matrix
// Input        : Integer
// Output       : Integer
// Discription  : This function accept numbers and display it in matrix form.    
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Matrix
{
	public int Arr[][];
	public Matrix(int iRow, int iCol)
	{
		Arr = new int[iRow][iCol];
	}
	protected void finalize()
	{
		Arr = null;
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter th elements");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		System.out.println("Elemenets of Matrix are : ");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_02
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

