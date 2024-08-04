import java.util.*;
public class DeleteLastArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("\n--------------------------");
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("Last array element before deletion: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.print("Last array element after deletion: ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}
		
		