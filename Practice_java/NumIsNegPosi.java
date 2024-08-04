import java.util.*;
public class NumIsNegPosi
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is positive number");
		}
		else
		{
			System.out.println(n+ " is negative number");
		}
	}
}

