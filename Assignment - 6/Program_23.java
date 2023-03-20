// Write a program to accept N numbers form user and return addition of perfect numbers.

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: CheckPerfect
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return the addition of perfect numbers.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum = 0, iResult = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			iSum = 0;
			for(int j = 1; j <= (Arr[i]/2); j++)
			{
				if(Arr[i] % j == 0)
				{
					iSum = iSum + j;
				}
			}
			if(iSum == Arr[i])
			{
				iResult = iResult + Arr[i];
			}
		}
		return iResult;
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program23
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
		System.out.println("Addition of perfect numbers : "+iRet);
	}
}

