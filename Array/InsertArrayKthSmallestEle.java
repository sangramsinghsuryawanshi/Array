import java.util.*;
public class InsertArrayKthSmallestEle
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
		System.out.print("\nOrignal array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");
		System.out.println("Enter n number to find smallest element:");
		int k = sc.nextInt();	
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\n asending array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.print("\nKth samllest element is: "+a[k-1]);	
		System.out.println("\n--------------------------");
	}
}
