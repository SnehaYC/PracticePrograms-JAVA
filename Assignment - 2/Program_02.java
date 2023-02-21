// Write a program which accept number from user and print even factors of that number.
//Input  : 24
//Output : 1 2 4 6 8 12

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
//  			  print even factors of that number. 
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------
class Number
{
	public
	
	void DisplayFactor(int iNo)
	{
		int i = 0;
		int iCnt = 1;
		if(iNo<=0)
		{
			iNo = -iNo;
		}
		for(iCnt=1; iCnt <= iNo/2; iCnt++)
		{
			if(((iNo%iCnt)==0) && ((iCnt%2)==0))
			{
				System.out.println(iCnt);
			}
		}
	}
	
}


//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------
class Program_02
{
	public static void main(String arg[])
	{
		int iValue = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter number :");
		iValue = SC.nextInt();
		
		Number obj = new Number();
		obj.DisplayFactor(iValue);
	} 
}

