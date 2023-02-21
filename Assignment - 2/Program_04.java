//Accept one character from user and convert case of that character.
//Input : a Output : A
//Input : D Output : d

//----------------------------------------------------------
// import statement
//----------------------------------------------------------
import java.util.*;

//----------------------------------------------------------
// Function Name: DisplayConvert
// Input        : Character
// Output       : Character
// Description  : This function accept Accept one character from 
//				  user and convert case of that character.
// Author       : Sneha Yogesh Choudhari
//----------------------------------------------------------
class CharConvertor
{
	public
	void DisplayConvert(char CValue) 
	{ 
		if(CValue >= 'a' && CValue <= 'z')
		{
			CValue = (char)((int)CValue - 32); 
			System.out.println(CValue); 
		}
		else if(CValue >= 'A' && CValue <= 'Z') 
		{ 
			CValue = (char)((int)CValue + 32);
			System.out.println(CValue);  
		} 
		else
		{
			System.out.println("Enter valid character.");
		}
	}
}
 

//----------------------------------------------------------
//Entry Point Function
//----------------------------------------------------------
class Program_04
{ 
	public static void main(String arg[]) 
	{ 
		char cValue = '\0'; 
		 
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter character: "); 
		cValue = SC.next().charAt(0);
		
		CharConvertor obj = new CharConvertor();
		obj.DisplayConvert(cValue); 
		 
		
	} 
}

