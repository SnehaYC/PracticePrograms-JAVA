// Write a program to check whether the string is anagram of not.
/*
	"abcde"	"cebad"
	"hello"	"loleh"
	"india"	"iinda"
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: StringX
// Discription  : This function accept two string from user and 
//                return true is the strings are anagram.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class StringX
{
	boolean CheckAnagram(String str1, String str2)
	{
		int i = 0;
		int count1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int count2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		if(str1.length() != str2.length())
		{
			return false;
		}
		char arr[] = str1.toCharArray();
		char brr[] = str2.toCharArray();

		for(i = 0 ;i < arr.length; i++)
		{
			count1[arr[i]-'a']++;		
			count2[brr[i]-'a']++;
		}
		for(i = 0; i < 26;i++)
		{
			if(count1[i] != count2[i])
			{
				break;
			}
		}	
		if(i == 26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------

class Program09
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter first string: ");
		String str1 = sobj.nextLine();
		System.out.println("Please enter second string: ");
		String str2 = sobj.nextLine();
		StringX obj = new StringX();
		boolean bRet = obj.CheckAnagram(str1,str2);
		if(bRet == true)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");		
	}
}

