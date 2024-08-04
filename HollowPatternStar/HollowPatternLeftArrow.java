import java.util.*;
public class HollowPatternLeftArrow
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int n=11;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					if(j==1 || i==n)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");	
			}
			for(int j=n;j>=i;j--)
			{
				if(i%2!=0)
				{
				if(j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				}
			}
			System.out.println();
		}

	}
}