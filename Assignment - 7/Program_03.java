// Accept string from user and return the frequency of one character. 
// Input : 
//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Discription  : This function accept N numbers from user and display all that numbers.    
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class StringX
{
	public 
	
	int CountA(String str)
	{
		char arr[] = str.toCharArray();
		int iCnt = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 'a')
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

class Program_03
{
	public static void main(String arg[])
	{
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string: ");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		
		System.out.println("Frequency of a is: " + iRet);
		iRet = obj.CountA(str);		
	}
}


