import java.util.*;
public class AsciiPatternFour
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=n,c=1;
		while(i>=1)
		{
			int j=1,ascii=65;
			while(j<=i)
			{
				System.out.print((char)(ascii++));
			j++;
			}
		System.out.println();
		i--;
		}
		i=1;
		while(i<=n)
		{
			int j=1,ascii=65;
			while(j<=i)
			{
				System.out.print((char)(ascii++));
			j++;
			}
		System.out.println();
		i++;
		}
	}
}