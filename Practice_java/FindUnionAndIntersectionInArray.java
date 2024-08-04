import java.util.*;
public class FindUnionAndIntersectionInArray 
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.print("Enter size of array:");
		int size1 = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];
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
		System.out.println("\n-----------------------------");
		System.out.print("Intersection of two array element:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					if(c[i]!=-1){
					System.out.print(c[i]+" ");
					}
					c[j]=-1;
					
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Union of two array element is:");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=-1)
			System.out.print(c[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
}

