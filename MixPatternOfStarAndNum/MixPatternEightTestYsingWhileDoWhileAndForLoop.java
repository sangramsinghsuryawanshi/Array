/*1
4*5*6
2*3
7*8*9*10*/
import java.util.*;
public class MixPatternEightTestYsingWhileDoWhileAndForLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int c=1,n1=2;
		for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((c++));
				if(j<i)
				System.out.print("*");
			}
		c++;
		System.out.println();
		}
		c=4;
		for(int i=2;i<3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				
				System.out.print((c++));
				if(j<3)
				System.out.print("*");
			}
		System.out.println();
		}
		c=2;
		for(int i=2;i>=2;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==4)
				continue;
				System.out.print((c++));
				if(j<i)
				System.out.print("*");
			}
		System.out.println();
		}
		c=7;
		for(int i=4;i>=4;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((c++));
				if(j<i)
				System.out.print("*");
			}
		System.out.println();
		}
	}
}