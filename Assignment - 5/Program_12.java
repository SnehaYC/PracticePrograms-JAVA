/*Accept number from user and check whether it is armstrong number or not.
   Input  : 153  (1*1*1)+(5*5*5)+(3*3*3) -> 1+125+27 -> 153
   Output : true
   Input  : 273  (2*2*2)+(7*7*7)+(3*3*3) -> 8+343+27 -> 378
   Output : false 
   Input  : 371  (3*3*3)+(7*7*7)+(1*1*1) -> 27+343+1 -> 371
   Output : true
   Input  : 1
   Output : true
   Input  : 57  (5*5)+(7*7) -> 25+49 -> 74
   Output : false
*/
//---------------------------------------------------------
// Imports
//---------------------------------------------------------
import java.util.*;

//---------------------------------------------------------
// Function Name: Armstrong
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
// 				  check whether it is armstrong number or not.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Digits
{
	boolean Armstrong(int iNo)
	{
		int temp = iNo;
		int Count = 0, iDigit = 0, iSum = 0, iPower = 1;
		while(temp != 0)
		{
			temp = temp/10;
			Count++;
		}
		temp = iNo;
		while(temp != 0)
		{
			iDigit = temp % 10;
			for(int i = 1; i <=Count; i++)
			{
				iPower = iPower * iDigit;
			}
			iSum = iSum + iPower;
			iPower = 1;
			temp = temp / 10;
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

class Program_22
{
	public static void main(String arg[])
	{
		int iNo = 0;
		boolean bRet = false;
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number: ");
		iNo = sobj.nextInt();
		
		Digits dobj = new Digits();
		bRet = dobj.Armstrong(iNo);
		
		if(bRet == true)
		{
			System.out.println("It is armstromng number.");
		}
		else
		{
			System.out.println("It is not armstrong number.");
		}
	}
}