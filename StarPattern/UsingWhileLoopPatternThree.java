import java.util.*;
public class UsingWhileLoopPatternThree
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("____________________________");
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				if(i==1 && j>=1 && j<=5 || i==2 && j>=1 && j<=4 || i==3 && j>=1 && j<=3 || i==4 && j>=1 && j<=2 || i==5 && j>=1 && j<=1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			j++;
			}
		i++;
		System.out.println();
		}
	}
}