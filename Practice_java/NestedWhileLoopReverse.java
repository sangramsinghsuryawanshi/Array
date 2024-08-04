import java.util.Scanner;
public class NestedWhileLoopReverse
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

		int i=n1;
		while(n<=n1)
		{
			int rev=0,rem=0;
			int temp=n;
			while(temp!=0)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;				
			}
		n++;
		System.out.print(rev+" ");
		}
		System.out.println("\n--------------------------------------");
	}
}