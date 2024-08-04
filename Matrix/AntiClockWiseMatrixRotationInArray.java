import java.util.*;
public class AntiClockWiseMatrixRotationInArray
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
		System.out.println("\n-----------------------------");
		System.out.println("Anti clock wise matrix array element is:");
		for(int i=a.length-1;i>=0;i--) // i = 0
		{
			for(int j=0;j<a[i].length;j++) // j = 0 1 2
			{
				System.out.print(a[j][i]+" "); // a[02][12][22] // 10 11 12// 00 01 02
			}
		System.out.println();
		}
	System.out.println("\n-----------------------------");
	}
}	