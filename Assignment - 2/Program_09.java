/*4.Write a program which accept number from user and return summation of all its non factors.
Input  : 12
Output : 50
Input  : 10
Output : 37
*/

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.Scanner;

//----------------------------------------------------------
// Function Name: SumNonFact
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
// 				  return summation of all its non factors.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class Number
{
	public
	
	int SumNonFact(int iNo)
	{
		int i,iSum=0;
		for(i=1; i <= iNo; ++i)
		{
		  if(iNo % i != 0)
			{
			   iSum = iSum + i;
			}
		}
		return iSum;
	}
}


//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------

class Program_09
{
	public static void main(String arg[])
	{
		 int iValue = 0;
		 int iRet = 0;
		 
		 Scanner SC = new Scanner(System.in);
		 
		 System.out.print("Enter number: ");
		 iValue = SC.nextInt();
		 
		 Number obj = new Number();
		 iRet = obj.SumNonFact(iValue);
		 
		 System.out.print(iRet);
	} 

}

