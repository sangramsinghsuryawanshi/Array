import java.util.*;
public class SortEvenAndOddAndPlaceEvenFirstAndOddLast
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;			
				}
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Leader array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
}