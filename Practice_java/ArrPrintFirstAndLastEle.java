import java.util.*;
public class ArrPrintFirstAndLastEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int []a= new int[5];
		System.out.print("Enter value for array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("_______________________________");
		System.out.println("First and last element:");
		System.out.println(a[0]);
		System.out.println(a[4]);

		System.out.println("_______________________________");
								
	}
}