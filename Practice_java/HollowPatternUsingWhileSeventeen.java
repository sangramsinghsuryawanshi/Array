import java.util.*;
public class HollowPatternUsingWhileSeventeen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int n=5;
		int i=1;
		while(i<=n)
		{
			int j=n;
			while(j>=i)
			{
				if(i==1 || j==n || i==j)
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