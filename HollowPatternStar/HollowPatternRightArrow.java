import java.util.*;
public class HollowPatternRightArrow
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

					if(i==n || i==j)
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
				if(i==j)
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