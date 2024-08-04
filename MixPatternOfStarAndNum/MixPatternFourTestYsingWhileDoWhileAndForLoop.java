import java.util.*;
public class MixPatternFourTestYsingWhileDoWhileAndForLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int c=1,n1=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((c--));
				if(j>1)
				System.out.print("*");
			}
		c=c+n1;
		n1=n1+2;
		System.out.println();
		}
		System.out.print("Enter any number For while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		c=1;n1=3;
		while(i<=n)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print((c--));
				if(j>1)
				System.out.print("*");
			j--;
			}
		c=c+n1;
		n1=n1+2;
		i++;
		System.out.println();
		}
		System.out.print("Enter any number For do while loop: ");
		 n = sc.nextInt();
		System.out.println("\n_________________________");
		i=1;
		c=1;
		n1=3;
		do
		{
			int j=i;
			do
			{
				System.out.print((c--));
				if(j>1)
				System.out.print("*");
			j--;
			}while(j>=1);
		c=c+n1;
		n1=n1+2;
		i++;
		System.out.println();
		}while(i<=n);

	}
}