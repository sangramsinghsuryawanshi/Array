import java.util.*;
public class NumberPatternFour
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
			int j=n,c=1;
			while(j>=i)
			{
				System.out.print(c);
			j--;
			c++;
			}
		System.out.println();
		i++;
		}
		i=1;
		while(i<=n)
		{
			int c=1;
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				
			j++;
			c++;
			}
		
		System.out.println();
		i++;
		}
	}
}