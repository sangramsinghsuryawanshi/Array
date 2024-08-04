import java.util.*;
public class CheckNumDivisibleByTwoAndFive
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		if(n%5==0 || n%2==0)
		{
			System.out.println("2 and 5 is divisible by "+n);
		}
		else
		{
			System.out.println("2 and 5 is not divisible by "+n);
		}
	}
}