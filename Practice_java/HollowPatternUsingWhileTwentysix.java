import java.util.*;
public class HollowPatternUsingWhileTwentysix
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
			
			int j=1;
			while(j<=i)
			{	
				System.out.print("*");	
			j++;
			}
			j=n;
			while(j>=i+1)
			{	
				System.out.print(" ");	
			j--;
			}
			
			j=n;
			while(j>=i+1)
			{	
				System.out.print(" ");	
			j--;
			}
			
			j=1;
			while(j<=i)
			{	
				System.out.print("*");	
			j++;
			}
			

			System.out.println();
		i++;
		}
		i=2;
		while(i<=n)
		{
			
			int j=n;
			while(j>=i)
			{	
				System.out.print("*");	
			j--;
			}
			j=1;
			while(j<=i-1)
			{	
				System.out.print(" ");	
			j++;
			}
			
			j=1;
			while(j<=i-1)
			{	
				System.out.print(" ");	
			j++;
			}
			
			j=n;
			while(j>=i)
			{	
				System.out.print("*");	
			j--;
			}

			System.out.println();
		i++;
		}
	}
}