public class CharAscciPatternAllIncreByOne
{
	public static void main(String[]ar)
	{
		int n=6,c=1;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}
	}
}