/* Accept number from user and display its table
 Input 4
 Output : 4   8   12  16  20  24  28  32  36  40

 Input : 5
 Output : 5   10  15  20  25  30  35  40  45  50
*/

//----------------------------------------------------------
// Imports
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: DisplayTable
// Input        : Integer
// Output       : Integer
// Discription  : This function accept number from user and 
//                display its table 
// Author       : Sneha Yogesh Choudhari
//-----------------------------------------------------------

class Numbers
{
	public
	
	void DisplayTable(int iNo) 
	{ 
		int iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		for(iCnt = 1; iCnt <= 10; iCnt++)
		{
			System.out.println(iNo * iCnt);
		}
	} 
}

//----------------------------------------------------------
// Entry point function
//----------------------------------------------------------
class Program_13
{
	public static void main(String arg[])
	{
		int iValue = 0, iRet = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		iValue = in.nextInt();
		
		Numbers obj = new Numbers();
		
		obj.DisplayTable(iValue);
		
	}
	
}

