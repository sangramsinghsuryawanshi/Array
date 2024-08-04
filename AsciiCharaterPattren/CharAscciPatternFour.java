public class CharAscciPatternFour
{
	public static void main(String[]ar)
	{
		int n=5;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)ascii+" ");
			}
			ascii++;
			System.out.println();
		}
	}
}