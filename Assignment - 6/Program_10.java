/* Accept N numbers from user and return the largest number. 
Input : N : 6 
 Elements : 85 66 3 66 93 88 
Output : 93
 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Maximum
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from 
//                user and return the largest number.  
// Date         : 25/10/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Maximum(int Arr[]) 
	{ 
		int iCnt = 0, iMax = 0;
		iMax = Arr[0];
		
		for(iCnt = 1; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] > iMax)
			{
				iMax = Arr[iCnt];
			}
		}
		return iMax;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_10
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
		
		iRet = obj.Maximum(Arr);
		
		System.out.print("Largest number is: " + iRet);
	
	}
	
}

