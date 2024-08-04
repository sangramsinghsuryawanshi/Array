import java.util.*;
public class AlphabetOrCharOrDigitOrSpecialCharNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit");
		char n = sc.next().charAt(0);
		if(n>='a' && n<='z' || n>='A' && n<='Z')
		{
			System.out.println(n+" it is a alphabet");
		}
		else if(n>='1' && n<='9')
		{
			System.out.println(n+ " it is a digit");
		}
		else
		{
			System.out.println(n+ " it is a special character");
		}
	}
}

