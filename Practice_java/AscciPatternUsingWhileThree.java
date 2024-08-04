import java.util.*;
public class AscciPatternUsingWhileThree
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
		int i=1;
		while(i<=n)
		{
			int ascci=65;
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(ascci++)+" ");
			j++;
			}
			System.out.println();
		i++;
		}
		i=2;
		while(i<=n)
		{
			int ascci=65;
			int j=n;
			while(j>=i)
			{
				System.out.print((char)(ascci++)+" ");
			j--;
			}
			System.out.println();
		i++;
		}

	}
}