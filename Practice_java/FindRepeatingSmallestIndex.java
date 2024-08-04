import java.util.*;
public class FindRepeatingSmallestIndex 
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		System.out.print("Smallest reapeating index of array element is:");
		int ele=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				ele=i;
				break;
			}
		}
		System.out.print(ele);
		System.out.println("\n-----------------------------------");
	}
}
		