import java.util.*;
public class NestedForLoopPrintArmstrongNum
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
		System.out.println("given Armstrong number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		
		for(int i=n;i<=n1;i++)
		{
			int rem=0,rev=0,temp=i;
			for(;temp!=0;)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
				temp=temp/10;	
			}
			if(rev==i)
			{
				System.out.println(rev+" ");
			}
		}
	}
}