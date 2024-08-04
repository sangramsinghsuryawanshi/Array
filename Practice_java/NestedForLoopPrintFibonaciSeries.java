import java.util.*;
public class NestedForLoopPrintFibonaciSeries
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("given Fibonacci number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		int a=0,b=1,c=0;
		for(int i=n;i<=n1;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}