import java.util.*;
public class SearchSpecifiedArrayEle
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
		System.out.print("\n Search specified Array element:");
		int s= sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				s=a[i];	
				c++;			
			}
		}
		System.out.print("\n--------------------------");
		System.out.print("\n The specified Array element is: "+s);
		System.out.print("\n--------------------------");
		System.out.print("\n The specified Array element coutn is: "+c);
		System.out.print("\n--------------------------");

	}
}
