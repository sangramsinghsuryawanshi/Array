public class NumPatternSevenUsingWhileLoop
{
	public static void main(String[]ar)
	{
		int n=5,i=1;
		while(i<=n)
		{
			int j=1;
			 j=n;
			while(j>=i)
			{
				System.out.print(j+" ");
			j--;
			}
		System.out.println();
		i++;
		}
	}
}