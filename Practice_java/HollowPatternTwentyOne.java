import java.util.*;
public class HollowPatternTwentyOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1,c=1;
		while(i<=n)
		{
			
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");
			k++;
			}
			int j=n;
			while(j>=i)
			{
				if(j==n || j==i || i==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			j--;
			}
		System.out.println();
		i++;
		}
		i=1;
		while(i<=n)
		{
			
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
			int j=1;
			while(j<=i)
			{
				if(j==1 || j==i || i==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			j++;
			}
		System.out.println();
		i++;
		}
	}
}