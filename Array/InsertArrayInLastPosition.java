import java.util.*;
public class InsertArrayInLastPosition
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int a[]=new int[size+1];
		System.out.println("--------------------------");
		System.out.print("Enter array element:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("\nOrignal array element:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");
		System.out.print("\nEnter array for first element:");
		int ele=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a[a.length-1]=ele;
		}
		System.out.print("\nInserted Last array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}
