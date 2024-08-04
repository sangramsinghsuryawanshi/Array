import java.util.*;
public class InsertArrayInClockWise
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
		System.out.println("Enter n number of rotation:");
		int n = sc.nextInt();
		for(int j=0;j<n;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
		a[0]=temp;
		}
		System.out.print("\nClockWise array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}
