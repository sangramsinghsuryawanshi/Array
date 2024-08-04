import java.util.Scanner;
public class MultiDimeMatrixArraySumOfTwoGivenArray
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
		int b[][]=new int[row][col];
		System.out.println("\n------------------------------");
		int sum=0;
		System.out.println("Enter array element: ");
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
		System.out.print("Given array is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("First given array sum is: "+sum);
		System.out.println("\n------------------------------");
		int sum1=0;
		System.out.println("Enter second array element: ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
				sum1+=b[i][j];
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Second given array is: ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n------------------------------");
		System.out.print("Second given array sum is: "+sum1);
		System.out.println("\n------------------------------");
		System.out.print("First and second given array sum is: "+(sum+sum1));
		System.out.println("\n------------------------------");
	}
}
