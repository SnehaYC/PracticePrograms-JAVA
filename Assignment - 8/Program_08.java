// Write a program to display maximum element of row.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;
import Marvellous.Matrix;
//----------------------------------------------------------
// Function Name: MaximumRow
// Discription  : This function accept row and column from user 
//                and return the maximum element row.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	void MaximumRow()
	{
		int iMax = 0;
		for(int i = 0; i< Arr.length; i++)
		{
			iMax = Arr[i][0];
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
			System.out.println("Maximum element of row no "+ (i+1) +" is : "+iMax );
		}
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_08
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
		
		Demo dobj = new Demo(row,col);
		
		dobj.Accept();
		dobj.Display();
		dobj.MaximumRow();
		
		System.gc();
	}
}

