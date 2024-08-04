import java.util.*;
public class MixPattern
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an n number:");
		int n=sc.nextInt();
		System.out.println("-----------------------");
		int ascii=71;
		int ascii1=70;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==1 || j==n)
				{
					System.out.print("* ");
				}
				else if(j==2|| j==6 || j==5 && i==6 || j==4 && i==5 || j==3 && i==4 || j==3 && i==3 || i==4 && j==5 || i==3 && j==5) 
				{ 
				System.out.print((char)ascii+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		ascii--;
		}
	}
}