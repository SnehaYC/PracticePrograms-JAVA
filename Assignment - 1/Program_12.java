/* Accept number from user and return the addition of all numbers till that number
 * Input : 4
 * Output : 10 (1 +  2 +  3 +  4)

 * Input : -6
 * Output : 21  (1 +  2 +  3 +  4 +  5 +  6)
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: Sum
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from user and return 
//                addition of all numbers till that number 
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	int Sum(int iNo) 
	{ 
		int iSum = 0, iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			iSum = iSum + iCnt;
		}
		return iSum;
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_12
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Numbers obj = new Numbers();
		iRet = obj.Sum(iValue);
		
		System.out.print("Summation is: " + iRet);
	}
	
}

