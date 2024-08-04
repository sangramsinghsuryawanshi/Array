import java.util.*;
public class HollowPatternUsingWhileEighteen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		int i=1;
		while(i<=n)
		{
			
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");	
			k++;
			}
			int j=n;
			while(j>=i)
			{
				if(j==n || i==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
			j--;
			}
			System.out.println();
		i++;
		}
	}
}