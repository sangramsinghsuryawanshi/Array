import java.util.*;
public class HollowPatternUsingWhileTwenty
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
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
				if(i%2!=0)
				{
				if(j==n || i==1 || j==i)
				{ 
					System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
				}
			j--;
			}
			System.out.println();
		i++;
		}
	}
}