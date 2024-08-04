import java.util.*;
public class UnionOfArrayAndIntersection
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first array size : ");
		int s1 = sc.nextInt();
		int a[] = new int[s1];
		System.out.print("Enter first array elements : ");		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.print("Enter second array size : ");
		int s2 = sc.nextInt();
		int b[] = new int[s2];
		System.out.print("Enter second array elements : ");		
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}

		System.out.println("\nUnion of two array : ");
		int s3 = s1+s2;
		int c[] = new int[s3];	
		for(int i =0;i<a.length;i++)
		{
			int ct=0;
			for(int j =0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					ct++;
					break;
				}
			}
			if(ct==0)
			{
				System.out.print(a[i]+"  ");
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"  ");
		}

		System.out.println("\nIntersection array : ");
		for(int i =0;i<a.length;i++)
		{
			int ct =0;
			for(int j =0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					ct++;
				}
			}
			if(ct != 0)
			{
				System.out.print(a[i]+"  ");
			}	
		}
		System.out.println();	
	}
}
