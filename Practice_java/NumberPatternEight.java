import java.util.*;
public class NumberPatternEight
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
			int j=n;
			while(j>=i)
			{
				System.out.print(j);
			j--;
			}
		System.out.println();
		i--;
		}
	}
}