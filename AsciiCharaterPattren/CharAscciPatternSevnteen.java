public class CharAscciPatternSevnteen
{
	public static void main(String[]ar)
	{
		int n=6,c=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			int ascii=c;
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(ascii++)+"");
			}
			System.out.println();
			c++;
		}
		for(int i=1;i<=n;i++)
		{
			int ascii=c-1;
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ascii+"");
				ascii++;
			}
			System.out.println();
			c--;
		}

	}
}