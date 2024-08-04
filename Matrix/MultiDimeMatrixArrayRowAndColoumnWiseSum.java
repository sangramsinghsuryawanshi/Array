import java.util.Scanner;
public class MultiDimeMatrixArrayRowAndColoumnWiseSum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of row array: ");
		int row = sc.nextInt();
		System.out.println("\n------------------------------");
		System.out.print("Enter size of coloumn array: ");
		int col = sc.nextInt();
		System.out.println("\n------------------------------");
		int a[][]=new int[row][col];
		System.out.println("\n------------------------------");
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Sum of row wise array element is: ");
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		System.out.print(i+" th row "+sum);
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Sum of col wise array element is: ");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[j][i];
			}
		System.out.print(i+" th col "+sum);
		System.out.println();
		}
		System.out.println("\n------------------------------");

	}
}
