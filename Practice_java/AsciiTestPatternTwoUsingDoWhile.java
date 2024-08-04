import java.util.*;
public class AsciiTestPatternTwoUsingDoWhile
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		do
		{
			int j=1,ascii=64+i;
			do
			{
				System.out.print((char)(ascii--)+"");
			j++;
			}while(j<=i);
		i++;
		System.out.println();
		}while(i<=n);
	}
}