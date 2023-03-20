// Write a program to display maximum element from matrix.
//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;
import Marvellous.Matrix;
//----------------------------------------------------------
// Function Name: Maximum
// Discription  : This function accept rows and columns from 
//                user and return the maximum from the matrix.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	int Maximum()
	{
		int iMax = Arr[0][0];
		for(int i = 0; i< Arr.length; i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
		}
		return iMax;
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_06
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
		
		int ret = dobj.Maximum();
		
		System.out.println("Maximum is : "+ret);
		
		System.gc();
	}
}
