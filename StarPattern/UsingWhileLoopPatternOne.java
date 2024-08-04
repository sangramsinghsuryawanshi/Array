import java.util.*;
public class UsingWhileLoopPatternOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("____________________________");
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
			j++;
			}
		i++;
		System.out.println();
		}
	}
}