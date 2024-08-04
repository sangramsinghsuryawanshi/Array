import java.util.*;
public class HollowPatternTwentyThree
{
	public static void main(String[]ar)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==5 || i==2 && j==4 || i==3 && j==3 || i==4 && j==2 || i==5 && j==1 || i==6 && j==2 || i==7 && j==3 || i==8 && j==4 || i==8 && j==5)
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