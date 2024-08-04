import java.util.*;
public class AsciiPatternEleven
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1,c=1;
		while(i<=n)
		{
			int j=1,ascii=64+i;
			while(j<=i)
			{
				System.out.print((char)(ascii--));
			j++;
			}
		System.out.println();
		i++;
		}
	}
}