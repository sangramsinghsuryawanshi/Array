import java.util.*;
public class StarPatternTenAndEleven
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		while(i<=n)
		{
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
			//if(i%2!=0)
			//{
				int j=1;
				while(j<=n)
				{
					System.out.print("*");
				j++;
				}
			//}
		System.out.println();
		i++;
		}
		i=2;
		while(i<=n)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");
			k++;
			}
			//if(i%2!=0)
			//{
				int j=1;
				while(j<=n)
				{
					System.out.print("*");
				j++;
				}
			//}
		System.out.println();
		i++;
		}

	}
}