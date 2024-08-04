public class NumPatternFloydTriangle
{
	public static void main(String[]ar)
	{
		int n=5;
		int c=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}