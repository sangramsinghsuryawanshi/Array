import java.util.*;
public class FindPeakArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		for(int i=0;i<a.length-2;i++)
		{
			if(a[i+1]>a[i+2] && a[i+1]>a[i])
			System.out.print(a[i+1]+" ");
		}
	}
}
