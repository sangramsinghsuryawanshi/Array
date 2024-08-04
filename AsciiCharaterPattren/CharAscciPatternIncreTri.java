public class CharAscciPatternIncreTri
{
	public static void main(String[]ar)
	{
		int n=6,c=0;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ascii+"");
			}
			System.out.println();
			ascii++;
		}
	}
}