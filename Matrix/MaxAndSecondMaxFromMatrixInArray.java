import java.util.*;
public class MaxAndSecondMaxFromMatrixInArray
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
		int max=0,secmax=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					secmax=max;
					max=a[i][j];			
				}
				else if(a[i][j]>secmax && secmax!=max)
				{
					secmax=a[i][j];
				}
			}
		}
		System.out.println("\n-----------------------------");
		System.out.println("max matrix array element:"+max);
		System.out.println("\n-----------------------------");
		System.out.println("Second max array element:"+secmax);
		System.out.println("\n-----------------------------");
	}
}