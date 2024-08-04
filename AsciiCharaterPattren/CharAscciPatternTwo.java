public class CharAscciPatternTwo
{
	public static void main(String[]ar)
	{
		int n=6;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ascii+" ");
			}
			System.out.println();
		ascii++;
		}
	}
}