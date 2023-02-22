/* Accept N numbers from user and display all such elements which are 
multiples of 11. 
Input : N : 6 
Elements : 85 66 3 55 93 88 
Output : 66 55 88  
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number of rows and number
//                of columns from user and display pattern.   
// Date         : 20/10/2022
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	void Display(int Arr[]) 
	{ 
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] % 11)==0)
			{
				System.out.print("  " + Arr[iCnt]);
			}
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_05
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

