import java.util.*;
public class MergeTwoArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[a.length+b.length];
		System.out.print("\nEnter first array elements : ");	
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("\nEnter second array elements : ");	
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		System.out.print("\nMerged array elements : ");	
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.print("\n----------------------------");	
	}
}
		