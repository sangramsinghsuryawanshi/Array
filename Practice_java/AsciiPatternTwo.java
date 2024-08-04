import java.util.*;
public class AsciiPatternTwo
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1,c=1;
		int ascii=65;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((char)ascii);
			j++;
			}
		System.out.println();
		ascii++;
		i++;
		}
	}
}