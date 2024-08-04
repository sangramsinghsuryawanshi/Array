import java.util.*;
public class UsingWhileLoopPatternEleven
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("____________________________");
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=n)
			{
				if(i==1 && j>=1 && j<=5 || i==2 && j>=2 && j<=6 || i==3 && j>=3 && j<=7 || i==4 && j>=4 && j<=8 || i==5 && j>=5 && j<=9)
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