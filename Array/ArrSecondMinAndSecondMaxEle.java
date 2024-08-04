import java.util.*;
public class ArrSecondMinAndSecondMaxEle
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
		int max=0,smax=0,tmax=0,min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				tmax = smax;
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]>tmax && a[i]!=smax)
			{
				tmax=a[i];
			}
			if(a[i]<min)
			{
				tmin=smin;
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && a[i]!=min)
			{
				tmin=smin;
				smin=a[i];
			}
			else if(a[i]<tmin && a[i]!=smin)
			{
				tmin=a[i];
			}

		}
		System.out.print("Maximum value of array element: "+max);
		System.out.println("\n--------------------------");
		System.out.print("Second Maximum value of array element: "+smax);
		System.out.println("\n--------------------------");
		System.out.print("Third Maximum value of array element: "+tmax);
		System.out.println("\n--------------------------");
		System.out.print("Minimum value of array element: "+min);
		System.out.println("\n--------------------------");
		System.out.print("Second Minimum value of array element: "+smin);
		System.out.println("\n--------------------------");
		System.out.print("Third Minimum value of array element: "+tmin);
		System.out.println("\n--------------------------");

	}
}
