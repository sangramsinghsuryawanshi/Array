public class CharAscciPatternThreePy
{
	public static void main(String[]ar)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			int ascii=65;
			for(int j=n-1;j>=i;j--)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}

	}
}