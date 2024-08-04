import java.util.*;
public class ArrMinAndMaxEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("--------------------------");
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("Maximum valur of array element: "+max);
		System.out.println("\n--------------------------");
		System.out.print("Minimum valur of array element: "+min);
		System.out.println("\n--------------------------");
	}
}
		