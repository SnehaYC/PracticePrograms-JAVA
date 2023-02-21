/* Write a program which accept number from user and display its multiplication of factors.
Input  : 12
Output : 144 (1 * 2 * 3 * 4 * 6)
Input  : 13
Output : 1 (1)
Input  : 10
Output : 10 (1 * 2 * 5)
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.*;
//----------------------------------------------------------
// Function Name: MultFact
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
// 				  display its multiplication of factors.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	int MultFact(int iNo)
	{
		int iCnt;
		int imult = 1;
		if(iNo<0)
		{
		  iNo = -iNo;
		}
		for(iCnt=1; iCnt <= iNo/2; iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				imult = imult * iCnt;
			}  			
		}
		return imult;
	}
}

//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------
class Program_06
{
	public static void main(String arg[])
	{
		int iValue = 0;
		int iRet = 0;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		iValue = SC.nextInt();
		
		Number obj = new Number();
		
		iRet = obj.MultFact(iValue);
		System.out.print(iRet);
		
	} 
}

