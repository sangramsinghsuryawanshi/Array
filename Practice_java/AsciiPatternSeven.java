import java.util.*;
public class AsciiPatternSeven
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
			int j=n,ascii=70;
			while(j>=i)
			{
				System.out.print((char)(ascii--));
			j--;
			}
		System.out.println();
		i++;
		}
	}
}