public class NumPatternOneUsingWhileLoop
{
	public static void main(String[]ar)
	{
		int n=5,i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
			j++;
			}
		System.out.println();
		i++;
		}
	}
}