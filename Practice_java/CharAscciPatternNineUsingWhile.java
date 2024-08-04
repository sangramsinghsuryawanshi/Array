public class CharAscciPatternNineUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		while(i<=n)
		{
			int ascii=65;
			int j=n;
			while(j>=i)
			{
				System.out.print((char)(ascii++)+" ");
			j--;
			}
			System.out.println();
			i++;
		}
	}
}