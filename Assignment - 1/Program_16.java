/* Accept number from user and return its factorial.
   Input : 5
   Output : 5*4*3*2*1       (120)

   Input :4
   Output : 4*3*2*1         (24)
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Fact
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from and return its factorial
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Fact(int iNo) 
	{ 
		int iCnt = 0, iResult = 1;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			iResult = iResult * iCnt;
		}
		return iResult;

	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_16
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Numbers obj = new Numbers();
		
		iRet = obj.Fact(iValue);
		
		System.out.print("Factorial of " + iValue + ": " + iRet);
		
	}
	
}

