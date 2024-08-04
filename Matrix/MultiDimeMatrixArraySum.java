import java.util.Scanner;
public class MultiDimeMatrixArraySum
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
		System.out.print("Enter array element: ");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				sum+=a[i][j];
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Enterd array element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Sum of array element is: "+sum);
	}
}
