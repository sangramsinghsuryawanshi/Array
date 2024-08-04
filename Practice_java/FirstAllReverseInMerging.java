import java.util.*;
public class FirstAllReverseInMerging
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		int a[] = new int[5];
		int b[] = new int[size];
		int c[] = new int[a.length+b.length];
		int x=0;
		System.out.print("Enter first array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter second array: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}	
		System.out.print("Reverse of first array and second is original: ");
		for(int i=a.length-1;i>=0;i--)//4
		{
			c[x++]=a[i];
		}
		for(int i=b.length-1;i>=0;i--)
		{
			c[x]=b[i];
			x++;
		}	
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}	
	}
}