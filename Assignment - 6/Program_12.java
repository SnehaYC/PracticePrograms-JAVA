/* Accept N numbers from user and return difference between frequency of 
even number and odd numbers. 
Input : N : 7 
 Elements : 85 66 3 80 93 88 90 
Output : 1 (4 -3) 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Frequency
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return difference between frequency of 
//                even number and odd numbers.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Frequency(int Arr[]) 
	{ 
		int iCnt1 = 0,iCnt2 = 0, i = 0 , iOdd = 0, iEven = 0;
		
		for(i = 0; i < Arr.length; i++)
		{
			if((Arr[i]%2)==0)
			{
				iEven = Arr[i]; 
			}
			else
			{
				iOdd = Arr[i];
			}
			if(iEven == Arr[i])
			{
				iCnt1++;
			}
			if(iOdd == Arr[i])
			{
				iCnt2++;
			}
		}
		return iCnt1 - iCnt2;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_12
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
		
		iRet = obj.Frequency(Arr);
		
		System.out.print("Frequency of even numbers is: " + iRet);
	
	}
	
}

