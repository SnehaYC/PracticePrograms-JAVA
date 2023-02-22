// Write a program which accept number from user and print even factors of that number.
//Input  : 36
//Output : 2 4 6 12 18

//----------------------------------------------------------
//import statement
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: DisplayEvenFactor
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user 
//                and print even factors of that number.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	void DisplayEvenFactor(int iNo)
	{
		int i = 0;
		if(iNo <= 0)
		{
			iNo = -iNo;
		}

		for(i = 1; i<= iNo/2 ;i++)
		{
			if(((iNo%i)==0) && ((i%2)==0))
			{
				System.out.println(i);
			}
		}
	}
}


//----------------------------------------------------------
//Entry Point Function
//---------------------------------------------------------- 

class Program_03
{
	public static void main(String arg[])
	{
		 int iValue = 0;
		
		 Scanner SC = new Scanner(System.in);
		 
		 System.out.println("Enter number: ");
		 iValue = SC.nextInt();
		
		 Number obj = new Number();
		 obj.DisplayEvenFactor(iValue);
	} 
}

