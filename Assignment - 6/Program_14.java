/* Accept N numbers from user and return frequency of 11 form it. 
Input : N : 6 
 Elements : 85 66 3 15 93 88 
Output : 0 
Input : N : 6 
 Elements : 85 11 3 15 11 111 
Output : 2
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Frequency
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user
//                and return frequency of 11 form it.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Frequency(int Arr[]) 
	{ 
		int i = 0, iCnt = 0, iValue = 0;
		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == 11)
			{
				iValue = Arr[i];
			}
			if(iValue == Arr[i])
			{
				iCnt++;
			}
		}
		return iCnt;
		
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_14
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
		
		System.out.print("Frequency of 11 is: " + iRet);
	
	}
	
}

