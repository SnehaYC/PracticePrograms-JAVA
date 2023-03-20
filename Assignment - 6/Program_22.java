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
	public boolean CheckPerfect(int iNo)
	{
		int iSum = 0;
		for(int i = 1; i <= (iNo/2); i++)
		{
			if(iNo % i == 0)
			{
				iSum = iSum + i;
			}
		}
		if(iSum == iNo)
		{	return true;	}
		else
		{	return false;	}
	}
	public int Sum(int Arr[])
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			if(CheckPerfect(Arr[i]) == true)
			{
				iSum = iSum + Arr[i];
			}
		}
		return iSum;
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program22
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		
		System.out.println("Enter number of elements: \n");
		iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Please enter the values: ");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		Numbers nobj = new Numbers();
		int iRet = nobj.Sum(Arr);
		System.out.println("Addition of perfect numbers : "+iRet);
	}
}


