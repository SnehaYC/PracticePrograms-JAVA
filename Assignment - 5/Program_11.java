/*Accept number from user and return its generic root.
   Input : 927 (927	-> 18 -> 9)
   Output: 9
   Input : 9975 (9975 -> 30	-> 3)
   Output: 9
   Input : 927 (89457 -> 33	-> 6)
   Output: 9
   Input : 8 (8	-> 8)
   Output: 8
   Input : 23 (23 -> 5)
   Output: 5 
*/
//---------------------------------------------------------
// Imports
//---------------------------------------------------------
import java.util.*;

//---------------------------------------------------------
// Function Name: GenRoot
// Input        : Integer
// Output       : Integer
// Description  : This function accept number from user and 
// 				  return its generic root.
// Author       : Sneha Yogesh Choudhari
//---------------------------------------------------------

class Digits
{
	int GenRoot(int iNo)	
	{
		int iSum = iNo;	

		while(iSum > 9)		
		{	
			iNo = iSum;				
			iSum = 0;
			while(iNo != 0)
			{
				iSum = iSum + (iNo % 10);	
				iNo = iNo / 10;
			}
		}
		return iSum;
	}
}

class Program_21
{
	public static void main(String arg[])
	{
		int iNo,iRet = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number: ");
		iNo = sobj.nextInt();
		
		Digits dobj = new Digits();
		iRet = dobj.GenRoot(iNo);
		
		System.out.println("Generic root is : " + iRet);

	}
}