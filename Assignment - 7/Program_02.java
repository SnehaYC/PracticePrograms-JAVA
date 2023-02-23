// Accept string from user and display it. 

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Discription  : This function accept string from user and display it.    
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class StringX
{
	public 
	
	void Display(String str)
	{
		char arr[] = str.toCharArray();
		
		for(int iCnt = 0; iCnt < arr.length; iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
	}
}



//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_02
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string: ");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		obj.Display(str);		
	}
}


