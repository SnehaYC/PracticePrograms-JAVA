/* Accept number and power from user and return the result.
  Input : 15   2
  Output : 
  Input : 21   6
  Output : False
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: DisplayTable
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number and power from 
//                user and return the result.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Power(int iNo, int power) 
	{ 
		int iCnt = 0, iPower = 1;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		if(power < 0)
		{
			power = -power;
		}
		
		for(iCnt = 1; iCnt <= power; iCnt++)
		{
			iPower = iPower * iNo;
		}
		return iPower;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_15
{
	public static void main(String arg[])
	{
		int iValue1 = 0, iValue2 = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue1 = in.nextInt();
		
		System.out.print("Enter power: ");
		iValue2 = in.nextInt();
		
		Numbers obj = new Numbers();
		
		iRet = obj.Power(iValue1,iValue2);
		
		System.out.print(iValue1 + "^" + iValue2 + " = " + iRet);
		
	}
	
}

