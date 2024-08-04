import java.util.*;
public class FindTheCommonEleFromThreeArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter 2 size of array:");
		int size1 = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter 3 size of array:");
		int size3 = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		int b[]=new int[size1];
		int c[]=new int[size3];
		int d[]=new int[a.length+b.length+c.length];
		System.out.print("Enter first array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		System.out.print("Enter second array element:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		System.out.print("Enter third array element:");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			d[x]=b[i];
			x++;
		}
		for(int i=0;i<c.length;i++)
		{
			d[x]=c[i];
			x++;
		}
		System.out.println("\n------------------------------");
		System.out.print("Commonarray element from three given arrays:");
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					if(d[i]!=-1 && d[j]!=-1)
					{
					System.out.print(d[i]+" ");
					}
					d[j]=-1;
					d[i]=-1;
				}
			}
		}
		System.out.println("\n-----------------------------");
	}
}