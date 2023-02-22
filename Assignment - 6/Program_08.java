/* Accept N numbers from user and return product of all odd elements. 
Input : N : 6 
Elements : 15 66 3 70 10 88 
Output : 45 

Input : N : 6  
Elements : 44 66 72 70 10 88 
Output : 0 
 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Product
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
	
	int Product(int Arr[]) 
	{ 
		int iCnt = 0, iResult = 0;
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt]%2) != 0)
			{
				iResult = 1;
				iResult = iResult * Arr[iCnt];
			}
		}
		return iResult;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_08
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
		
		iRet = obj.Product(Arr);
		
		System.out.print("Product is : " + iRet);
	
	}
	
}

