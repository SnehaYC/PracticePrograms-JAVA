/* Accept N numbers from user and return difference between summation 
of even elements and summation of odd elements. 
Input : N : 6 
 Elements : 85 66 3 80 93 88
Output : 53 (234 - 181)  
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Difference
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and 
//                return difference between summation of even 
//                elements and summation of odd elements.    
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Number
{
	public
	
	int Difference(int Arr[]) 
	{ 
		int iSumEven = 0, iSumOdd = 0;
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt]%2)==0)
			{
				iSumEven = iSumEven + Arr[iCnt];
			}
			else
			{
				iSumOdd = iSumOdd + Arr[iCnt];
			}
		}
		return iSumEven - iSumOdd;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_18
{
	public static void main(String arg[]) 
	{ 
		int iSize = 0,iRet = 0,iCnt = 0; 
		
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
		
		Number obj = new Number();
		
		iRet = obj.Difference(Arr);
		System.out.println("Difference is: "+ iRet); 
	 
	}
	
}


