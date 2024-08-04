public class CharAscciPatternFive
{
	public static void main(String[]ar)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			int ascii=70;
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(ascii--)+" ");
			}
			System.out.println();
		}
		int c=0;
		for(int i=1;i<=n;i++)
		{
			int ascii=65+c;
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)ascii+" ");
				ascii--;
			}
			System.out.println();
			c++;
		}

	}
}