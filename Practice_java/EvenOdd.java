import java.util.*;
public class EvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+ " is odd number");
		}
	}
}

