import java.util.*;
public class ArrayLargestkElementFromele
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size =  sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter an kth to find largest element:");
		int k= sc.nextInt();
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Kth largest number from array:"+a[k-1]);
	}
}
			
			 
			