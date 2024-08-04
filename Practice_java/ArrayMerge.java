import java.util.*;
public class ArrayMerge
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int a[] ={1,2,3,4,5};
		int b[] ={6,7,8,9};
		int c[] = new int[a.length+b.length];
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
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
		
		