import java.util.*;
public class MixStarAndAsciiPattern
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an n number:");
		int n=sc.nextInt();
		System.out.println("-----------------------");
		int ascii=63;
		for(int i=1;i<=n;i++)
		{
			int a=ascii;
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1 || k==i)
				{
					System.out.print("* ");
				}
				else if(k==2 || k==i-1 || i==n)
				{
					System.out.print((char)(a++)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		ascii++;
		System.out.println();
		}
	}
}
				
				