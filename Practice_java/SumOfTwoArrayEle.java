import java.util.*;
public class SumOfTwoArrayEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("\nEnter array elements : ");	
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter target value : ");
		int t = sc.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				sum=a[i]+a[j];
				if(t==sum)
				{
				System.out.println(a[i]+" "+a[j]+" ");
				}
			}
		}
		System.out.print("\n----------------------------");

	}
}
				
