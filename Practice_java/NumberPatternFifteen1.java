import java.util.*;
public class NumberPatternFifteen1
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
			
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
			j++;
			}
		System.out.println();
		i++;
		}
		i=n-1;
		while(i>=1)
		{
			
			int k=i;
			while(k<=n)
			{
				System.out.print(" ");
			k++;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
			j++;
			}
		System.out.println();
		i--;
		}
	}
}