/* Accept N numbers from user and return the smallest number. 
Input : N : 6 
 Elements : 85 66 3 66 93 88 
Output : 3 

 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Minimum
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from 
//                user and return the smallest number.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Minimum(int Arr[]) 
	{ 
		int iCnt = 0, iMin = 0;
		iMin = Arr[0];
		
		for(iCnt = 1; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}
		}
		return iMin;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_16
{
	public static void main(String arg[])
	{
		int iSize = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		iSize = in.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Please enter " + iSize + " elements: ");
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = in.nextInt();
		}
		
		Numbers obj = new Numbers();
		
		iRet = obj.Minimum(Arr);
		
		System.out.print("Smallest number is: " + iRet);
	
	}
	
}

