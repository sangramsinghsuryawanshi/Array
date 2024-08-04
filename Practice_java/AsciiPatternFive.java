import java.util.*;
public class AsciiPatternFive
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
			int j=i,as=64+i;
			while(j>=1)
			{
				System.out.print((char)as);
				as--;
			j--;
			}
		System.out.println();
		i--;
		}
		i=1;
		while(i<=n)
		{
			int j=i,ascii=64+i;
			while(j>=1)
			{
				System.out.print((char)(ascii--));
			j--;
			}
		System.out.println();
		i++;
		}
	}
}