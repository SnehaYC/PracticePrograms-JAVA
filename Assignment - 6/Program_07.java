/* Accept N numbers from user and accept one another number as NO , 
return index of last occurrence of that NO. 
Input : N : 6 
NO: 66 
Elements : 85 66 3 66 93 88 
Output : 3 

Input : N : 6 
NO: 93 
Elements : 85 66 3 66 93 88 
Output : 4 

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
// Function Name: LastOcc
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and
//                accept one another number as NO , 
//                return index of last occurrence of that NO. 
// Date         : 25/10/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int LastOcc(int Arr[],int No) 
	{ 
		int i = 0;
		
		for(i = Arr.length-1; i >= 0; i--)
		{
			if(Arr[i] == No)
			{
				break;
			}
		}	
		return i;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_07
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
		
		iRet = obj.LastOcc(Arr, iNo);
		
		if(iRet == -1) 
		{ 
			System.out.print("There is no such number."); 
		} 
		else 
		{ 
			System.out.print("Last occurrence of number is " + iRet); 
		}
	
	}
	
}

