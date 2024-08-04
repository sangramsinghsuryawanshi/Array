import java.util.*;
public class CheckIfArrayContainTwoSpecifiedNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		System.out.print("Enter first specified array:");
		int t = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter second specified array:");
		int t1 = sc.nextInt();
		System.out.println("\n-----------------------------");
		int c=0,d=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==t)
			{
				c++;
			}
			else if(a[i]==t1)
			{
				d++;
			}
		}
		if(c==1 && d==1)
		{
			System.out.print("Both specified numbers are present");
		}
		else if(c!=1 && d==0)
		{
			System.out.print(t1+" are not present");
		}
		else if(c==1 && d!=0)
		{
			System.out.print(t+" are not present");
		}
		else
		{
			System.out.print("Both specified numbers are not present");
		}
		System.out.println("\n-----------------------------");
	}
}

				