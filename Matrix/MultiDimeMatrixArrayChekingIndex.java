import java.util.Scanner;
public class MultiDimeMatrixArrayChekingIndex
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter" +i+""+j+" th index  wise array element: ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{										System.out.print(i+""+j+" : "+a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

		