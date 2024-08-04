import java.util.*;
public class PrintArrayDisplayFirstSeconAndThird
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		System.out.println("_______________________________");
		int []a=new int[size];
		System.out.println("Enter value for array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("_______________________________");
		System.out.println("\nFirst second and third Number from element:");
		System.out.println(a[0]);	
		System.out.println(a[1]);	
		System.out.println(a[2]);							
	}
}