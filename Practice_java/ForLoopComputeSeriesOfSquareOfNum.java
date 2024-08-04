import java.util.Scanner;
public class ForLoopComputeSeriesOfSquareOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("natural number series square upto "+n+" is:");
		System.out.println("--------------------");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print((i*i)+" + ");
			sum=sum+(i*i);
		}
		System.out.println("---->"+sum);
	}
}

