import java.util.*;
public class PrintNameUsingArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		String a[] = new String[size];
		System.out.println("Enter the array name:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("index = "+i+" name = "+a[i]);
		}
	}
}