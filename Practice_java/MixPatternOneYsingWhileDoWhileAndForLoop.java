import java.util.*;
public class MixPatternOneYsingWhileDoWhileAndForLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int c=1;
		for(int i=1;i<=n;i++)
		{
				
			for(int j=1;j<=n;j++)
			{
				System.out.print((c++));
				if(j<n)
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.print("Enter any number For while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		c=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print((c++));
				if(j<n)
				System.out.print("*");
			j++;
			}
		i++;
		System.out.println();
		}
		System.out.print("Enter any number For do while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		i=1;
		c=1;
		do
		{
			int j=1;
			do
			{
				System.out.print((c++));
				if(j<n)
				System.out.print("*");
			j++;
			}while(j<=n);
		i++;
		System.out.println();
		}while(i<=n);

	}
}