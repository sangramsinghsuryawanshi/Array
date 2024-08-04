import java.util.*;
public class HollowPattern
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || i==5 || i==j)
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