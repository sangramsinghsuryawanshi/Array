import java.util.*;
public class HollowPatternRightArrow
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("___________________");
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)		
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++)
				{
					if(j==1 || i==n)					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int k=1;k<=i;k++)		
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++)
				{
					if(j==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			System.out.println();
		}

	}
}