import java.util.*;
public class NumberPatternFourteen
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
				System.out.print(k);
			k++;
			}

			int j=i-1;
			while(j>=1)
			{
				System.out.print(j);
			j--;
			}
		System.out.println();
		i++;
		}
	}
}