import java.util.*;
public class NestedForLoopPrintMultipleTable
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
		System.out.println("given sum of digit "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		
		for(int i=n;i<=n1;i++)
		{
			int sum=0;
			int rem=0,temp=i;
			for(int j=1;j<=10;j++)
			{
				System.out.print((i*j)+" ");	
			}
			System.out.println();
		}
	}
}