/* Accept N numbers from user check whether that numbers contains 11 in 
it or not. 
Input : N : 6 
Elements : 85 66 11 80 93 88 
Output : 11 is present 
Input : N : 6 
Elements : 85 66 3 80 93 88 
Output : 11 is absent 
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Check
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user check
//                whether that numbers contains 11 in it or not. 
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	boolean Check(int Arr[]) 
	{ 
		int i = 0;
		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == 11)
			{
				break;
			}
		}
		if(i == Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_13
{
	public static void main(String arg[])
	{
		int iSize = 0;
		boolean	bRet = false;
		
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
		
		bRet = obj.Check(Arr);
		
		if(bRet == true)
		{
			System.out.print("11 is present.");
		}
		else
		{
			System.out.print("11 is not present.");
		}
	
	}
	
}

