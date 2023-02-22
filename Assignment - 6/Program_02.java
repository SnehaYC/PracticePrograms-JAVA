/* Accept N numbers from user and display all such elements which are 
divisible by 5. 
Input : N : 6 
 Elements : 85 66 3 80 93 88 
Output : 85 80  
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and display  
//                all such elements which are divisible by 5.    
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	void Display(int Arr[]) 
	{ 
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt]%5)==0)
			{
				System.out.print("  " + Arr[iCnt]);
			}
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_02
{
	public static void main(String b[])
	{
		int iSize = 0;
		
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
		
		obj.Display(Arr);
		
		
	}
	
}


