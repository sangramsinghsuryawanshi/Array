import java.util.*;
public class AsciiTestPatternFourUsingDoWhile
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1,ascii=65;
		do
		{
			int j=n,a=ascii;
			do
			{
				System.out.print((char)(a++)+"");
			j--;
			}while(j>=i);
		ascii++;
		i++;
		System.out.println();
		}while(i<=n);
	}
}