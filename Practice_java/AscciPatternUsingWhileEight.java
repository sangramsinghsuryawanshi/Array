import java.util.*;
public class AscciPatternUsingWhileEight
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
		int i=1;
		while(i<=n)
		{
			int ascci=70;
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(ascci--)+" ");
			j++;
			}
			System.out.println();
		i++;
		}
	}
}a