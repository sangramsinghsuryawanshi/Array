import java.util.*;
public class NestedForLoopPrintPerfectNumAdd
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("given perfect number "+n+" is: ");
		System.out.println("--------------------------");
		
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			if(n%i==0)
			{
				sum=sum+i;
			}
			if(sum==n)
		{
			System.out.println("perfect number");

		}
		}
		
	}
}