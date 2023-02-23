/* Accept N numbers from user and return the position of that number of last occurance.
Input : N : 6 
Elements  : 3 66 3 80 93 80
			3
Output :   2
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: LastOccuranceAt
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return the position of that number of last occurance.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Number
{
	public
	
	int LastOccuranceAt(int Arr[], int iValue) 
	{ 
		int iCnt = 0;
		for(iCnt = Arr.length-1; iCnt >= 0; iCnt--)
		{
			if(Arr[iCnt] == iValue)
			{
				break;
			}
		}
		return iCnt;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_20
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
		
		iRet = obj.LastOccuranceAt(Arr,iValue);
		
		if(iRet == -1)
		{
			System.out.println("There is no such number. ");
		}
		else
		{
			System.out.println("Last occurance is at: " + iRet);
		}
	 
		Arr = null;
	}
	
}


