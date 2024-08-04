import java.util.*;
public class AddTwoNumIntoEcahArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		System.out.print("the array element is :");
		for(int i=0;i<a.length;i++)
		{
			int n=a[i],rem=0;
			for(int temp=n;temp!=0;temp=temp/10)
			{
				rem=temp%10;
			}
			if(rem==a[i])
			{
				System.out.print((a[i]+2)+" ");
			}
		}
		System.out.println("\n----------------------");
	}
} 