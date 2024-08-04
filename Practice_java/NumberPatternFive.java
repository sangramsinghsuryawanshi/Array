import java.util.*;
public class NumberPatternFive
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=n;
		while(i>=1)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j);
			j--;
			}
		System.out.println();
		i--;
		}
		i=1;
		while(i<=n)
		{
			int c=4;
			int j=i;
			while(j>=1)
			{
				System.out.print((j--)+"");
			c--;
			}
		
		System.out.println();
		i++;
		}
	}
}