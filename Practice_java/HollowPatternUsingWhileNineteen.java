import java.util.*;
public class HollowPatternUsingWhileNineteen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int n=9;
		int i=1;
		while(i<=n)
		{
			
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");	
			k--;
			}
			int j=1;
			while(j<=i)
			{
				if(i%2!=0)
				{
				if(j==1 || i==n || j==i)
				{ 
					System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
				}
			j++;
			}
			System.out.println();
		i++;
		}
	}
}