import java.util.*;
public class MatrixMultiplicationByRowAndColTwoBYThree
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and col size :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("\n----------------------");
		int a[][]=new int[row][col];
		int b[][]=new int[row1][col1];
		int c[][]=new int[a.length][b[0].length];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter 2 array element :");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}		
		System.out.println("\n--------------------------");
		if(a.length==b[0].length)	
		{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a[i].length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.print("Enterrd array element :");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
		}
		else
		{
			System.out.print("array element :");
		}
	}
		
}
