import java.util.Scanner;
public class ForLoopComputeSeriesOfOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Odd series number upto "+n+" is:");
		System.out.println("--------------------");
		int sum=0,a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" + ");
				sum=sum+i;
			}
		}
		System.out.println("---->"+sum);
	}
}

