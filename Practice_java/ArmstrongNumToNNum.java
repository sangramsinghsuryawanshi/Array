import java.util.*;
public class ArmstrongNumToNNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		System.out.println("Enter n1 number");
		int n1 = sc.nextInt();
		int i=n;
		while(i<=n1)
		{
			int rem=0,rev=0,temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
				temp=temp/10;
			}
			if(rev==i)
			{
				System.out.print(rev+" ");
			}
		i++;
		}
	}
}