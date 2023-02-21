/* Accept number from user and check whether it is perfect or not
 Input : 6
 Output : True        (6)   1 +  2 +  3

 Input :  12
 output : False       (16)  1+ 2 + 3 + 4 + 6
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: CheckPerfect
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from and 
//                check whether it is perfect or not.
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	boolean CheckPerfect(int iNo) 
	{ 
		int iCnt = 0, iResult = 1, iSum = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		for(iCnt = 1; iCnt <= iNo/2; iCnt++)
		{
			if((iNo % iCnt) == 0)
			{
				iSum = iSum + iCnt;
			}
		}
		if(iSum == iNo)
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
class Program_17
{
	public static void main(String arg[])
	{
		int iValue = 0;
		boolean bRet = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Numbers obj = new Numbers();
		
		bRet = obj.CheckPerfect(iValue);
		
		if(bRet == true)
		{
			System.out.print(iValue + " is perfect number.");
		}
		else
		{
			System.out.print(iValue + " is not perfect number.");
		}
	}
	
}

