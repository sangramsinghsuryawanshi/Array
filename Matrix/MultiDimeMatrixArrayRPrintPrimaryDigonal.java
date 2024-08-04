import java.util.Scanner;
public class MultiDimeMatrixArrayRPrintPrimaryDigonal
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
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Given array is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		int sum=0;
		System.out.println("\n------------------------------");
		System.out.print("Primary digonal element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j) 
				{
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
				}
			}
	
		System.out.println();
		}
		System.out.print(sum);
		int sum1=0;
		System.out.println("\n------------------------------");
		System.out.print("Secondary digonal element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i+j==a.length-1){
				System.out.print(a[i][j]+" ");
				sum1+=a[i][j];
				}
			}
		System.out.println();
		}
		System.out.print(sum1);
		System.out.println("\n------------------------------");

	}
}
