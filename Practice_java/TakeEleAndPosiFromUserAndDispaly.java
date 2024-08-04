import java.util.*;
public class TakeEleAndPosiFromUserAndDispaly
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
		System.out.println("\n-----------------------------");
		System.out.print("Enter any array element for position:");
		int ele = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter any position for array element:");
		int posi = sc.nextInt();
		System.out.println("\n-----------------------------");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)==posi)
			{
				a[i]=ele;
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Inserted array element at given position:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------");
	}
}
