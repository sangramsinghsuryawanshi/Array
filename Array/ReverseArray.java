import java.util.*;
public class ReverseArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length];
		System.out.println("--------------------------");
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		System.out.print("Orignal array element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("\n--------------------------");
		int ind=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[ind]=a[i];
			ind++;

		}
		System.out.println("\n--------------------------");
		System.out.print("Reverse array element:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");

		}
		System.out.println("\n--------------------------");

	}
}
