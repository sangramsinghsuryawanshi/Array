import java.util.*;
public class UpperTriangularAndLowerMatrixUsingArray
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
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n-----------------------------");
		System.out.print("given array element is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
		System.out.println("given Upper triangular array element is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
		System.out.println("given Lower triangular array element is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i<j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
		System.out.println();
		}
		System.out.println("\n-----------------------------");
	}
}


