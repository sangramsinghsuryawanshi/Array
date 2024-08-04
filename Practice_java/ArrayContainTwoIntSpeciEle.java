import java.util.*;
public class ArrayContainTwoIntSpeciEle
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
		int c1=4,c2=7,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==c1 || a[i]==c2)
			{	
				c++;			
			}
		}
		if(c==2)
		{
			System.out.print("\n The specified Array element is present");
		}
		else
		{
			System.out.print("\n--------------------------");
			System.out.print("\n The specified Array element not present");
		}
	System.out.print("\n--------------------------");
	}
	
}
