import java.util.Scanner;
public class ForLoopComputeSeriesOfAddingOfOneNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("natural number series 1+3+6.. upto "+n+" is:");
		System.out.println("--------------------");
		int sum=0,a=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" + ");
			sum=sum+i;
			a+=1;
			i+=a;
		}
		System.out.println("---->"+sum);
	}
}

