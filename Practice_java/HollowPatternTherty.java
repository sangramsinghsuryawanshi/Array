import java.util.*;
public class HollowPatternTherty
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("___________________");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i || i==1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=n;k>=i+1;k--)		
			{       
                              	if(i==1)
				{
                              		System.out.print("* ");
                                }
				else
				{
					System.out.print("  ");
                                }
			}
				for(int j=1;j<=i;j++)
				{
					if(j==1 || j==i ||i==1)
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
		for(int i=2;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if(j==n || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=2;k<=i;k++)		
			{
                             	if(i==n)
				{
                              		System.out.print("* ");
                                }
				else
				{
					System.out.print("  ");
                                }
			}
				for(int j=n;j>=i;j--)
				{
					if(j==n || j==i)
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