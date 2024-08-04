import java.util.Scanner;
public class ForLoopPossiblities
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(i+" "+j);
			}
		}
	}
}