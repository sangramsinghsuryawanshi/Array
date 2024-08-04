import java.util.*;
public class MaxBetwwenThree
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n = sc.nextInt();
		System.out.println("Enter second number");
		int n1 = sc.nextInt();
		System.out.println("Enter third number");
		int n3 = sc.nextInt();
		if(n>n1)
		{
			System.out.println(n+" is greater than" +n1+" and "+n3);
			if(n1>n)
			{
				System.out.println(n1+ " is greater than "+n+" and "+n3);
			}
		}
		else
		{
			System.out.println(n3+ " is greater than "+n+" and "+n1);
		}
	}
}

