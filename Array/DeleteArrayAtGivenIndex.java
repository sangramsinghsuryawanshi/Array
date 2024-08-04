import java.util.*;
public class DeleteArrayAtGivenIndex
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
		System.out.print("array element before deletion given index: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.print("\nEnter index to delete array: ");
		int ind = sc.nextInt();
		for(int i=ind;i<a.length-1;i++)
		{
			a[ind]=a[i+1];
		}
		System.out.println("\n--------------------------");
		System.out.print("array element after deletion given index:  ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------------------");
	}
}
		
		
