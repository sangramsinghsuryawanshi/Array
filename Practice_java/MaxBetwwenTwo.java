import java.util.*;
public class MaxBetwwenTwo
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n = sc.nextInt();
		System.out.println("Enter second number");
		int n1 = sc.nextInt();
		if(n>n1)
		{
			System.out.println(n+" is greater than" +n1);
		}
		else
		{
			System.out.println(n1+ " is greater than "+n);
		}
	}
}

