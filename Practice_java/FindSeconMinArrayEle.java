import java.util.*;
public class FindSeconMinArrayEle
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
		int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && smin!=min)
			{
				smin=a[i];
			}
		}
		System.out.print("\nSecond min array element is : "+smin);
		System.out.print("\n----------------------------");

	}
}