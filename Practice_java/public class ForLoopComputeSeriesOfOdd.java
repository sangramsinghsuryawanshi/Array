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
		for(int i=0;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i+" + ");
				sum=sum+i;
			}
			i++;
		}
		System.out.println("---->"+sum);
	}
}
1.Write a program to compute the series. 1 + 3 + 5 + 7 + 9 + ………..+ n
2. Write a program to compute the series. 1 + 4 + 9 + 16 + ……..+ n
3. Write a program to compute the series. 1 + 8 + 27 + 64 + ……..+ n
