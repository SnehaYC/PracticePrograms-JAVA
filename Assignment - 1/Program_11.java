/* Accept percentage from user and Display the status of result.
 
    0 to 35   ->   Fail
    35 to 50  ->   Pass class
    50 to 60  ->   Second class
    60 to 70  ->   Fisrt class
    70 to 100 ->   Distinction
*/


//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
//
// Function Name: Sum
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from user and 
//                display the result 
// Author       : Sneha Yogesh Choudhari
//
//-----------------------------------------------------------

class Numbers
{
	public
	
	void CheckResult(int iMark) 
	{ 
		
		if((iMark < 0) || (iMark > 100))
		{
			System.out.print("Invalid Marks..");
		}
		
		if((iMark >= 0) && (iMark < 35))
		{
			System.out.print("You are failed..");
		}
		else if((iMark >= 35) && (iMark < 50))
		{
			System.out.print("You have cleared the exam with " + iMark + "%.");
		}
		else if((iMark >= 50 ) && (iMark < 60))
		{
			System.out.print("You have cleared the exam with second class.");
		}
		else if((iMark >= 60) && (iMark < 70))
		{
			System.out.print("You have cleared the exam with First class.");
		}
		else
		{
			System.out.print("You have cleared the exam with distinction.");
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_11
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		iValue = in.nextInt();
		
		Numbers obj = new Numbers();
		
		obj.CheckResult(iValue);
		
	}
	
}

