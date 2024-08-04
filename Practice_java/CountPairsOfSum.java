import java.util.*;
public class CountPairsOfSum
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
		System.out.print("Enter sum: ");
		int k = sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=a[i]+a[j];
				if(sum==k)
				{
					System.out.print(a[i]+" "+a[j]+" ");
					c=1;
				}		
			}
		}
		System.out.println("Count: "+c);
	}
}