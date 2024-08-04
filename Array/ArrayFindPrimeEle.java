import java.util.*;
public class ArrayFindPrimeEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("--------------------------");
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("Orignal array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");
		for(int i=0;i<a.length;i++)
		{
			int c=0,n=a[i];
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(n+" ");
			}
		}
		System.out.println("\n--------------------------");

	}
}
