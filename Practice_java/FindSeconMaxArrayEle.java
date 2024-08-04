import java.util.*;
public class FindSeconMaxArrayEle
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
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && smax!=max)
			{
				smax=a[i];
			}
		}
		System.out.print("\nSecond max array element is : "+smax);
		System.out.print("\n----------------------------");

	}
}