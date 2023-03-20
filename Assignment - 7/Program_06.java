// Write a program to count upper case letter from string.
//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: StringX
// Discription  : This function accept string from user and 
//                return the count of upper letters from string.   
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class StringX
{
	public int CapCount(String str)
	{
		char arr[] = str.toCharArray();
		int iCnt = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if((arr[i] >= 'A') && (arr[i] <= 'Z'))
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

class Program05
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string: ");
		
		String str = sobj.nextLine();

		StringX obj = new StringX();
		int iRet = obj.CapCount(str);
		System.out.println("Number of capital letters are : "+iRet);		
	}
}

