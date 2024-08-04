import java.util.*;
public class DigonalMatrix
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
				if(i!=j && a[i][j]!=0)
				{
					c++;
					break;
				}
				else if(i==j && a[i][j]==0)
				{
					c++;
					break;
				}
			}
			if(c==1)
			{
				break;
			}
		}
		if(c==0)
		{
			System.out.println("given matrix is digonal:");
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
			System.out.print("given matrix is not digonal:");
		}
	}
}