/*5.Write a program which accept number from user and return difference between summation of all its factors and non factors. 
Input  : 12
Output : -34 (16 - 50)
Input  : 10
Output : -29 (8 - 37)
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: FactDiff
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and difference between
// 				  summation of all its factors and non factors.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	int FactDiff(int iNo)
	{
		int i,iSum=0;
		for(i=1; i <= iNo/2; ++i)
		{
		  if(iNo % i == 0)
			{
			   iSum = iSum + i;
			}
		}
		return iSum;
	}	
	int Factsum(int iNo)
	{   
		int j,iSum1=0;
		for(j=1; j <= iNo; ++j)
		{
		  if(iNo % j != 0)
			{
			   iSum1 = iSum1 + j;
			}
		}
		return iSum1;
	}
}

//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------
class Program_10
{
	public static void main(String arg[])
	{
	 int iValue = 0;
	 int iRet = 0;
	 int iRet2 = 0;
	 
	 Scanner SC = new Scanner(System.in);
	 
	 System.out.print("Enter number: ");
	 iValue = SC.nextInt();
	 
	 Number obj = new Number();
	 
	 iRet = obj.FactDiff(iValue);
	 iRet2 = obj.Factsum(iValue);
	 
	 System.out.print(iRet-iRet2);
	}
}
