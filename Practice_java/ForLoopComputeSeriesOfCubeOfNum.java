import java.util.Scanner;
public class ForLoopComputeSeriesOfCubeOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("natural number series cube upto "+n+" is:");
		System.out.println("--------------------");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print((i*i*i)+" + ");
			sum=sum+(i*i*i);
		}
		System.out.println("---->"+sum);
	}
}

