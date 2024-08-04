import java.util.*;
public class ReverseArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.print("\n--------------------------");
		int a[]=new int[size];
		System.out.print("\nEnter Array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n--------------------------");
		System.out.print("\n Revers Array:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n--------------------------");
	}
}
