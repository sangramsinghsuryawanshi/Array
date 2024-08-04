import java.util.*;
public class StarPatternFour
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
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");
			k++;
			}
				int j=n;
				while(j>=i)
				{
					System.out.print("*");
				j--;
				}
		System.out.println();
		i++;
		}
	}
}