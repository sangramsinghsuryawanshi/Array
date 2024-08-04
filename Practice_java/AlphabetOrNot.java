import java.util.*;
public class AlphabetOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		char n = sc.next().charAt(0);
		if(n>='a' && n<='z')
		{
			System.out.println(n+" alphabet");
		}
		else
		{
			System.out.println(n+ " not alphabet");
		}
	}
}

