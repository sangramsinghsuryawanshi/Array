import java.util.*;
public class SysmentricOfMatrixInArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row of array:");
		int row = sc.nextInt();
		System.out.println("\n-----------------------------");
		System.out.print("Enter col of array:");
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("\n-----------------------------");
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					c++;
				}
			}
		System.out.println();		
		}
		if(c==0)
		{
			System.out.print("Symentric matrix:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}

		}
		else
		{
			System.out.print("not symentric matrix:");
		}
	}
}