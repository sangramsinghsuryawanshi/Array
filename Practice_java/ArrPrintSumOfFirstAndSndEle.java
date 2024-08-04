import java.util.*;
public class ArrPrintSumOfFirstAndSndEle
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
		System.out.println("Sum of array element:");
		System.out.println((a[0]+a[1])+"");

		System.out.println("_______________________________");
								
	}
}