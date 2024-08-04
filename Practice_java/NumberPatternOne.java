import java.util.*;
public class NumberPatternOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.print("\n_________________________");
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
	}
}