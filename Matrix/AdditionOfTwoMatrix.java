import java.util.*;
public class AdditionOfTwoMatrix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row of array:");
		int row = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter col of array:");
		int col = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		System.out.print("Enter 1 array element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Enter 2 array element:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n-----------------------------");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];				
			}
		}
		System.out.println("\n-----------------------------");
		System.out.println("given subtraction of array element is:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
	}
}


