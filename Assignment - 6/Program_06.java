/*Accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO. 
Input : N : 6 
NO: 66 
Elements : 85 66 3 66 93 88 
Output : 1 

Input : N : 6 
NO: 12 
Elements : 85 11 3 15 11 111 
Output : -1
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: FirstOcc
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and
//                accept one another number as NO , 
//                return index of first occurrence of that NO. 
// Date         : 25/10/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int FirstOcc(int Arr[],int No) 
	{ 
		int i = 0;
		
		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == No)
			{
				break;
			}
		}
		if(i == Arr.length)
		{
			return -1;
		}
		else
		{
			return i;
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_06
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
		
		System.out.print("Enter the number: ");
		int iNo = in.nextInt();
		
		Numbers obj = new Numbers();
		
		iRet = obj.FirstOcc(Arr, iNo);
		
		if(iRet == -1) 
		{ 
			System.out.print("There is no such number."); 
		} 
		else 
		{ 
			System.out.print("First occurrence of number is " + iRet); 
		}
	
	}
	
}

