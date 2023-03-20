// Write a program to check whether the string is anagram of not.
// Input  : ______Sneha___________ 
// Length : 22
// Output: 
// New string : Sneha
// Length : 5
//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program_12
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		String temp = str.trim();
		System.out.println("New string is : "+temp);
		System.out.println("Length of new string is : "+temp.length());
		String temp2 = temp.replaceAll("\\s+","");
		System.out.println("Modified string is : "+temp2);
	}
}
