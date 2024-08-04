import java.util.*;
public class FindDuplicateArrayAndDispaly
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("\n----------------------------");
		int a[]= new int[size];
		System.out.print("Enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------------");
		System.out.print("Enterd array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n----------------------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.print("Duplicate array is:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
		}
		System.out.println("\n----------------------------");
	}
}



	
