public class NumPatternFiveUsingWhile
{
	public static void main(String[]ar)
	{
		int n=5;
		int i=n;
		while(i>=1)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j+" ");
			j--;
			}
			System.out.println();
			i--;
		}
		i=1;
		while(i<=n)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j+" ");
			j--;
			}
			System.out.println();
			i++;
		}
	}
}