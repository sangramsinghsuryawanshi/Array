import java.util.*;
public class AscciPatternUsingWhileFive
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
			int ascci=70;
			int j=n;
			while(j>=i)
			{
				System.out.print((char)(ascci--)+" ");
			j--;
			}
			System.out.println();
		i++;
		}
		i=1;
		int ascci=65;
		while(i<=n)
		{
			int j=1,as=ascci;
			while(j<=i)
			{
				System.out.print((char)(as--)+" ");
			j++;
			}
			System.out.println();
			ascci++;
		i++;
		}

	}
}