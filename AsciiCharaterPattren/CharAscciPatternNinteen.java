public class CharAscciPatternNinteen
{
	public static void main(String[]ar)
	{
		int n=6,c=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			int ascii=65+c;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
			c--;
		}
	}
}