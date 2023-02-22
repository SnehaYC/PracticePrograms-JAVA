/*  Accept N numbers from user and return the difference between largest 
and smallest number. 
Input : N : 6 
 Elements : 85 66 3 66 93 88 
Output : 90 (93 -3) 

*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Difference
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return the difference between largest 
//                and smallest number.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Difference(int Arr[]) 
	{ 
		int iCnt = 0, iMin = Arr[0], iMax = Arr[0], iResult = 0;
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] > iMax)  
			{
				iMax = Arr[iCnt];
			}
			else if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}
			iResult = iMax - iMin;
		}
		return iResult;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_17
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
		
		iRet = obj.Difference(Arr);
		
		System.out.print("Difference between largest and smallest number is: " + iRet);
	
	}
	
}

