import java.util.*;
public class NestedForLoopPrintSumOfTheSeries
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
		System.out.println("given sum of series "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		double sum=0;
		for(int i=n;i<=n1;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				sum=i+(1/j);
			}
			
		}
System.out.println(sum);
	}
}