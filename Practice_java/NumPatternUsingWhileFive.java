import java.util.*;
public class NumPatternUsingWhileFive
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
			int j=n;
			while(j>=i)
			{
				System.out.print(j+" ");
			j--;
			}
			System.out.println();
		i++;
		}
		i=1;
		//int ascci=1;
		while(i<=n)
		{
			int j=1;//as=ascci;
			while(j<=i)
			{
				System.out.print(j+" ");
			j++;
			}
			 j=i-1;//as=ascci;
			while(j>=1)
			{
				System.out.print(j+" ");
			j--;
			}

			System.out.println();
		i++;
		}

	}
}