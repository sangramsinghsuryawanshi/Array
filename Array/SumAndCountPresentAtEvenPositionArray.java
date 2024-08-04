import java.util.*;
public class SumAndCountPresentAtEvenPositionArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.print("\n--------------------------");
		int a[]=new int[size];
		System.out.print("Enter Array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n--------------------------");
		System.out.print("Array element in odd position:");
		int c=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.print(a[i]+" ");
				c++;
				sum+=a[i];
			}
		}
		System.out.print("\n--------------------------");
		System.out.print("Sum of Array element in odd position is :"+sum);
		System.out.print("\n--------------------------");
		System.out.print("Count of Array element in odd position is :"+c);
	}
}
