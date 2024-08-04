import java.util.*;
public class NestedForLoopPrintFactorialOfNNum
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
		System.out.println("given Factorial of number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		
		for(int i=n;i<=n1;i++)
		{
			int fact=1;
			int rem=0,temp=i;
			for(int j=1;j<=i;j++)
			{
				fact*=j;	
			}
			System.out.println(i+" = "+fact);
		}
	}
}