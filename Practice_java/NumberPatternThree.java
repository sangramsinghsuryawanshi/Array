import java.util.*;
public class NumberPatternThree
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
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
			j++;
			}
		System.out.println();
		i++;
		}
		i=2;
		while(i<=n)
		{
			int c=1;
			int j=n;
			while(j>=i)
			{
				System.out.print(c);
				
			j--;
			c++;
			}
		
		System.out.println();
		i++;
		}
	}
}