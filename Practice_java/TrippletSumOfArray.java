import java.util.*;
public class TrippletSumOfArray
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
		System.out.println("\n------------------------------");
		System.out.print("Given Sum of triplet is:");
		int t=24,c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int sum=0;
					sum+=a[i]+a[j]+a[k];
					if(sum==t)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]+" ");
						c++;
					}
				}
			}
		}
		if(c==1)
		{
			System.out.println("True");
			c++;
		}
		else
		{
			System.out.println("False");
		}
		System.out.println("\n------------------------------");
	}
}