import java.util.*;
public class FirstEleTharOccursAtKTimes
{
	public static void main(String[]ar)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size= sc.nextInt();
		System.out.println("\n------------------------");
		int a[]= new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n------------------------");
		System.out.print("Enter n of array:");
		int n= sc.nextInt();
		System.out.println("\n------------------------");
		System.out.print("Enter kth number:");
		int k= sc.nextInt();
		System.out.println("\n------------------------");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.print(a[i]+" ");
				break;
			}
		}
		System.out.println("\n------------------------");
	}
}

		
