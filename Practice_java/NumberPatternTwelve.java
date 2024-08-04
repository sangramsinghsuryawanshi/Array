import java.util.*;
public class NumberPatternTwelve
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int i=1;
		while(i<=n)
		{
			int j=i,c=j;
			while(j>=1)
			{
				System.out.print(c+" ");
				c=c+5;
			j--;
			}
		System.out.println();
		i++;
		}
	}
}