import java.util.*;
public class MatrixToArrayConversion
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
			System.out.println();
		}
		int arr[]=new int[row*col];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				arr[ind++]=a[i][j];
			}
		}
		System.out.println("\n-----------------------------");
		System.out.println("Conversion of matrix to array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}