import java.util.*;
public class StarPatternUsingWhileTenEleven
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
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}

			int j=n;
			while(j>=1)
			{
				System.out.print("*");
			j--;
			}
			System.out.println();
		i++;
		}
		i=1;
		//int ascci=1;
		while(i<=n)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");
			k++;
			}
			int j=1;//as=ascci;
			while(j<=n)
			{
				System.out.print("*");
			j++;
			}

			System.out.println();
		i++;
		}

	}
}