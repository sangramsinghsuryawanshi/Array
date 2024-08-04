import java.util.*;
public class SumAndCountPresentAtOddPositionArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.print("\n--------------------------");
		int a[]=new int[size];
		System.out.print("\nEnter Array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n--------------------------");
		System.out.print("\nArray element in odd position:");
		int c=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				System.out.print(a[i]+" ");
				c++;
				sum+=a[i];
			}
		}
		System.out.print("\n--------------------------");
		System.out.print("\nSum of Array element in odd position is :"+sum);
		System.out.print("\n--------------------------");
		System.out.print("\nCount of Array element in odd position is :"+c);
		System.out.print("\n--------------------------");

	}
}
