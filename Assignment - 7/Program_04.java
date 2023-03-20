// Write a program to print string on screen.
//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: StringX
// Discription  : This function accept string from user and display it.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class StringX
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program04
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


