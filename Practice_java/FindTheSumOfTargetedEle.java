import java.util.*;
public class FindTheSumOfTargetedEle
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
		System.out.println("\n-----------------------------------");
		System.out.print("Enter target value:");
		int t = sc.nextInt();
		System.out.println("\n-----------------------------------");
		System.out.print("Given targeted sum is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=a[i]+a[j];
				if(sum==t)
				{
					System.out.print(a[i]+" "+a[j]+" ");
				}
			}
		}
		System.out.println("\n-----------------------------------");
	}
}