import java.util.*;
public class AlphabetLowerOrUpperCase
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit");
		char n = sc.next().charAt(0);
		if(n>='a' && n<='z')
		{
			System.out.println(n+"alphabet in lower case");
		}
		else if(n>='A' && n<='Z')
		{
			System.out.println(n+ " alphabet in upper case");
		}
		else
		{
			System.out.println(n+ " it is a special character");
		}
	}
}

