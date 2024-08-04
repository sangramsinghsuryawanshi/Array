import java.util.*;
public class LeaderEleIfIsGraterThanItsRight
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
		System.out.println("\n-----------------------------------");
		System.out.print("Enterd given array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(a[i]>a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.println("\n-----------------------------------");
		System.out.print("Leader array element is:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
}