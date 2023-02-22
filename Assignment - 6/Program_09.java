/*Accept N numbers from user and accept Range, Display all elements from 
that range 
Input : N : 6 
Start: 60 
End : 90 
Elements : 85 66 3 76 93 88 
Output : 66 76 88
 
Input : N : 6 
Start: 30 
End : 50 
Elements : 85 66 3 76 93 88 
Output : 
 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Range
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return product of all odd elements. 
// Date         : 25/10/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	void Range(int Arr[], int iStart, int iEnd) 
	{ 
		int iCnt = 0;
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
			{
				System.out.print(" " + Arr[iCnt]);
			}
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_09
{
	public static void main(String arg[])
	{
		int iSize = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		iSize = in.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Please enter " + iSize + " elements: ");
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = in.nextInt();
		}
		
		System.out.print("Enter the starting point : ");
		int iNo1 = in.nextInt();
		
		System.out.print("Enter the ending point : ");
		int iNo2 = in.nextInt();
		
		Numbers obj = new Numbers();
		
		obj.Range(Arr, iNo1, iNo2);
	
	}
	
}

