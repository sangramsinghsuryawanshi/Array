import java.util.Scanner;
public class ForLoopReverseNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("reverse number "+n+" upto "+n1+" is:");
		System.out.println("--------------------");
		int sum=0,a=0;
		for(int i=n1;i>=n;i--)
		{
			System.out.print(i+" ");
		}
	}
}

