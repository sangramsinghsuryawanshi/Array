public class NumPatternSixthUsingWhileLoop
{
	public static void main(String[]ar)
	{
		int n=5,i=1;
		while(i<=n)
		{
			int k=1;
			k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
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