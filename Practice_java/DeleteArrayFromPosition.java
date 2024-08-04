import java.util.*;
public class DeleteArrayFromPosition
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
		System.out.print("Enter Position of array to delete element:");
		int ind = sc.nextInt();
		for(int i=ind-1;i<a.length-1;i++)
		{
                        
			a[i]=a[i+1];
		}
		System.out.println("\n-----------------------------");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------");
	}
}

			
