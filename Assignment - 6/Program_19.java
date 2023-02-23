/* Accept N numbers from user and return the position of that number of first occurance.
Input : N : 6 
Elements  : 85 66 3 80 93 80 
			80
Output :  3
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: FirstOccuranceAt
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return the position of that number of first occurance.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Number
{
	public
	
	int FirstOccuranceAt(int Arr[], int iValue) 
	{ 
		int iCnt = 0, iPos = 0;
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == iValue)
			{   
				iPos = iCnt; 
				break; 
			}
		}
		if(iCnt == Arr.length)
		{ 
			return -1; 
		}
		else
		{  
			return iPos;   
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_19
{
	public static void main(String arg[]) 
	{ 
		int iSize = 0, iRet = 0, iCnt = 0, iValue = 0; 
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of elements: "); 
		iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		if(iSize == 0)
		{
			return;
		}
		System.out.println("Please enter " + iSize + " elements: "); 
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		System.out.println("Enter the element that you want to search: "); 
		iValue = sobj.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.FirstOccuranceAt(Arr,iValue);
		
		if(iRet == -1)
		{
			System.out.println("There is no such number. ");
		}
		else
		{
			System.out.println("First occurance is at: " + iRet);
		}
	 
		Arr = null;
	}
	
}


