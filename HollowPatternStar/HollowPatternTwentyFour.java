import java.util.*;
public class HollowPatternTwentyFour
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=5 || i==2 && j==4 || i==2 && j==8 || i==3 && j==3 || i==3 && j==7 || i==4 && j==2 || i==4 && j==6 || i==5 && j>=1 && j<=5)
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