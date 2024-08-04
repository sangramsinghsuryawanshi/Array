import java.util.*;
public class AscendingArrayEle
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];	
					a[j]=t;
				}
			}
		}
		System.out.print("\nAscending array elements : ");	
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n----------------------------");
	}
}