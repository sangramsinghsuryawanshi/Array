import java.util.*;
public class MixPatternSevenTestYsingWhileDoWhileAndForLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int c=6,n1=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(c);
				if(j>i)
				System.out.print("*");
			}
		c--;
		System.out.println();
		}
		c=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				if(j<i)
				System.out.print("*");
			}
		c++;
		System.out.println();
		}

		System.out.print("Enter any number For while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		c=6;
		while(i<=n)
		{
			int j=n;
			while(j>=i)
			{
				System.out.print(c);
				if(j>i)
				System.out.print("*");
			j--;
			}
		c--;
		i++;
		System.out.println();
		}
		i=1;
		c=3;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(c);
				if(j<i)
				System.out.print("*");
			j++;
			}
		c++;
		i++;
		System.out.println();
		}

		System.out.print("Enter any number For do while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		i=1;
		c=6;
		do
		{
			int j=n;
			do
			{
				System.out.print(c);
				if(j>i)
				System.out.print("*");
			j--;
			}while(j>=i);
		c--;
		i++;
		System.out.println();
		}while(i<=n);
			
		i=1;
		c=3;
		do
		{
			int j=1;
			do
			{
				System.out.print(c);
				if(j<i)
				System.out.print("*");
			j++;
			}while(j<=i);
		c++;
		i++;
		System.out.println();
		}while(i<=n);
	}
}