import java.util.*;
public class SortArrayAsending
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\n--------------------------");
		System.out.print("Ascending array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");

	}
}
