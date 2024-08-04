import java.util.*;
public class SandlePointMatrix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and col size :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("\n----------------------");
		int a[][]=new int[row][col];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n----------------------");
		System.out.print("Minimum value in row and maximumvalue in column is :");
		int ind=-1;
		for(int i=0;i<a.length;i++)
		{
			int rmin=Integer.MAX_VALUE,cmax=0;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<rmin)
				{
					rmin=a[i][j];
					ind=j;
				}
			}
			for(int k=0;k<a[i].length;k++)
			{
				if(a[k][ind]>cmax)
				{
					cmax=a[k][ind];
				}
			}
			if(rmin==cmax)
			{
				System.out.print(rmin);
			}
		}
		System.out.println("\n----------------------");
	}
}