import java.util.*;
public class JaggedArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------------");
		int a[][]={{1,2},{1,2,3},{1},{1,2,3,4,5}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}