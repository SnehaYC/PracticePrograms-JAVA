/* Accept number from user and check whether first number is divisible by second number or not.
  Input : 15   5
  Output : True
  Input : 21   6
  Output : False
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: CheckDivisible
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from user and check 
//                whether first number is divisible by second 
//                number or not.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	boolean CheckDivisible(int iNo1, int iNo2) 
	{ 
		if((iNo1 % iNo2) == 0)
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
class Program_14
{
	public static void main(String arg[])
	{
		int iValue1 = 0, iValue2 = 0;
		boolean bRet = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter second number: ");
		iValue2 = in.nextInt();
		
		Numbers obj = new Numbers();
		
		bRet = obj.CheckDivisible(iValue1,iValue2);
		
		if(bRet == true)
		{
			System.out.print(iValue1 + " is divisible by " + iValue2);
		}
		else
		{
			System.out.print(iValue1 + " is not divisible by " + iValue2);
		}
		
	}
	
}

