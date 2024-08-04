import java.util.*;
public class HollowPatternTwentyOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1|| i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");	
			}
			for(int j=n;j>=i;j--)
			{
				if(j==n|| i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}