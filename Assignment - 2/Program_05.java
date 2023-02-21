// Accept on character from user and check whether that character is vowel(a,e,i,o,u) or not.
//Input : E Output : TRUE
//Input : d Output : FALSE

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: ChkVowel
// Input        : Character
// Output       : Character
// Description  : This function accept one character from user and 
//				  check whether that character is vowel(a,e,i,o,u) or not.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------

class CharConvertore
{
	public
	boolean ChkVowel(char x)
	{
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
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
//Entry Point Function
//----------------------------------------------------------

class Program_05
{
	public static void main(String arg[])
	{ 
		char cValue = '\0'; 
		
		boolean bRet = false;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter character: ");
		cValue = SC.next().charAt(0);
		
		CharConvertore obj = new CharConvertore();
		
		bRet = obj.ChkVowel(cValue);

		if(bRet == true)
		{
			System.out.print("It is Vowel");
		}
		else
		{
			System.out.print("It is not Vowel");
		}
	}
}
