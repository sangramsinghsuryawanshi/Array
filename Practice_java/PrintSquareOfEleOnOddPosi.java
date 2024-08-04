import java.util.*;
public class PrintSquareOfEleOnOddPosi
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
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				a[i]=a[i]*a[i];			
			}
		}
		System.out.print("\n Square of odd position Array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\n--------------------------");

	}
}
