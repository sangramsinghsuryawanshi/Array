import java.util.*;
public class AlternateReverseMerging
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[a.length+b.length];
		int x=0;
		System.out.print("Enter first array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter second array: ");
		for(int i=b.length-1;i>=0;i--)
		{
			b[i]=sc.nextInt();
		}
		int y=0;
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=a[x];
				x++;
			}
			else
			{
				c[i]=b[y];
				y++;
			}
			/*c[i]=a[x];
			i++;	
			x++;
			c[i]=b[y];
			y++;*/
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}