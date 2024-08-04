import java.util.*;
public class AsciiTestPatternOneUsingDoWhile
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int ascii=70,i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print((char)ascii+"");
			j++;
			}while(j<=i);
		ascii--;
		i++;
		System.out.println();
		}while(i<=n);
	}
}