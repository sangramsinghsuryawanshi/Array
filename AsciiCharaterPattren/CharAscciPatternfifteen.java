public class CharAscciPatternfifteen
{
	public static void main(String[]ar)
	{
		int n=6,c=0;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			int ascii=65;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}
	}
}