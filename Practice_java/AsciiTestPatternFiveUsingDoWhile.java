import java.util.*;
public class AsciiTestPatternFiveUsingDoWhile
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
			int j=1,a=65;
			do
			{
				System.out.print((char)(a++)+"");
			j++;
			}while(j<=i);
		i++;
		i++;
		System.out.println();
		}while(i<=n);
	}
}