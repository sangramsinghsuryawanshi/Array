import java.util.*;
public class FindSmallestNumMissingFromArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size-1];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(size>
			sum+=a[i];
		}
		int total=size*(size+1)/2;
		System.out.print((total-sum)+" ");
	}
}