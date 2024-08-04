import java.util.*;
public class NestedForLoopPrintSumOfDigit
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
			for(;temp!=0;)
			{
				rem=temp%10;
				temp=temp/10;
				sum+=rem;
			}
			System.out.print(sum+" ");
		}
	}
}