import java.util.*;
public class PrintArrayDisplay
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		System.out.println("_______________________________");
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" th value for array:");
			a[i]=sc.nextInt();
		}
		System.out.println("_______________________________");
		System.out.println("\nOdd Number from index:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}						
	}
}