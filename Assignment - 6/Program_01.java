/* Accept two numbers from user and display first number in second number of times.
Input  : 12 5
Output : 12 12 12 12 12
Input  : -2 3
Output : -2 -2 -2
Input  : 21 -3
Output : 21 21 21
Input  : -2 0
Output : 
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Display
// Input        : Integer
// Output       : Integer
// Description  : This function Accept two numbers from user 
//                and display first number in second number of times. 
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	void Display( int iNo, int iFrequency)
	{
		int iCnt;
		for(iCnt = 1;iCnt <= iNo;iCnt++)
		{
			System.out.println(iFrequency);
		}
	} 
}


//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------

class Program_01
{
	public static void main(String arg[])
	{
		 int iValue = 0;
		 int iCount = 0;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter number: ");
		 iValue = sc.nextInt();
		 
		 System.out.print("Enter frequency: ");
		 iCount = sc.nextInt();
		 
		 Number obj = new Number();
		 obj.Display(iCount, iValue);
		 
	}
}
