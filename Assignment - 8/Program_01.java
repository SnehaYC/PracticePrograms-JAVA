// Accept N number from user and display that number. 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;


//-----------------------------------------------------------
// Function Name : Matrix
// Input         : Integer
// Output        : Integer
// Description   : This function accept matrix and return 
//                 addition of all elements which are in matrix.
// Author        : Sneha Yogesh Choudhari
//------------------------------------------------------------
class Matrix
{
	public int Addition(int Arr[][])
	{
		int iSum = 0;
		for(int i = 0; i< Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length;j++)
			{
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}
//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_01
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		int Arr[][] = new int[row][col];

		System.out.println("Enter the elements");
		for(int i = 0; i < Arr.length; i++)	
		{
			for(int j = 0; j < Arr[i].length; j++)	
			{
				Arr[i][j] = sobj.nextInt();
			}
		}

		System.out.println("Entered elements are");
		for(int i = 0; i < Arr.length; i++)	
		{
			for(int j = 0; j < Arr[i].length; j++)	
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}

		Matrix mobj = new Matrix();
		int ret = mobj.Addition(Arr);
		System.out.println("Addition is : "+ret);

		Arr = null;
	}
}


