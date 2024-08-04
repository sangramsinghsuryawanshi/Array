import java.util.*;
public class ReplaceAllNegativeValuesWithImmeLeftEleSquInArray
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
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];				
			}
		}
		System.out.print("\n--------------------------");
		System.out.print("\n Replacing all negative value with its immediate left elements square:");
		int c=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");			
		}

		System.out.print("\n--------------------------");
	}
}
