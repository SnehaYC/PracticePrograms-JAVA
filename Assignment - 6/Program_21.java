// Write a program to accept N numbers form user and return addition of that numbers.


//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Sum
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return the addition of numbers.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			iSum = iSum + Arr[i];
		}
		return iSum;
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program21
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Enter number of elements\n");
		iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		System.out.println("Please enter the values");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		Numbers nobj = new Numbers();
		int iRet = nobj.Sum(Arr);
		System.out.println("Addition of N numbers : "+iRet);
	}
}


