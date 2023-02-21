// Accept number from user and check whether number is even or odd.

//-----------------------------------------------------------
// Header File and Macros
//-----------------------------------------------------------
import java.util.Scanner;

//-----------------------------------------------------------
// Function Name: ChkEven
// Input        : Integer
// Output       : Integer
// Description  : This function Accept number from user 
//                and check whether number is even or odd.  
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Number
{
	public
	
	boolean ChkEven(int iNo)
	{
		if((iNo%2)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


//-----------------------------------------------------------
//Entry Point Function
//-----------------------------------------------------------

class Program_3
{
	public static void main(String args[])
	{
		int iValue = 0;
		
		Scanner sc = new Scanner(System.in);
		
		boolean bRet = false;
		
		System.out.println("Enter number: ");
		iValue = sc.nextInt();
		
		Number obj = new Number();
		
		bRet = obj.ChkEven(iValue);
		
		if(bRet == false)
		{
			System.out.println(iValue + " is even number.");
		}
		else
		{
			System.out.println(iValue+" is odd number.");
		}
	}
}
