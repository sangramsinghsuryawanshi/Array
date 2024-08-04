public class CharAscciPatternEleven
{
	public static void main(String[]ar)
	{
		int n=6,c=0;
		for(int i=1;i<=n;i++)
		{
			int ascii=65+c;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii--)+" ");
			}
			System.out.println();
			c++;
		}
	}
}