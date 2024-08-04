import java.util.*;
public class LeaderInArrayGreterEleInRightSide
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=-1;
				}
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Leader array element is:");
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=-1)
			System.out.print(a[j]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
}