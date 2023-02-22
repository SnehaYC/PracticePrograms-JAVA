/* Accept N numbers from user and return frequency of even numbers. 
Input : N : 6 
Elements : 85 66 3 80 93 88 
Output : 3 
  
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: CountEven
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return frequency of even numbers.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int CountEven(int Arr[]) 
	{ 
		int iValue = 0, iCnt = 0, i = 0;
		
		for(i = 0; i < Arr.length; i++)
		{
			if((Arr[i]%2)==0)
			{
				System.out.print(Arr[i]);
				iValue = Arr[i];
			}
			if(Arr[i] == iValue)
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
class Program_11
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
		
		iRet = obj.CountEven(Arr);
		
		System.out.print("Frequency of even numbers is: " + iRet);
	
	}
	
}

