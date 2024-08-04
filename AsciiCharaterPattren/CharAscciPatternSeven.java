public class CharAscciPatternSeven
{
	public static void main(String[]ar)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			int ascii=70;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(ascii--)+" ");
			}
			System.out.println();
		}
	}
}