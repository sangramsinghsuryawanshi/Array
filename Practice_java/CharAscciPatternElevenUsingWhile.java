public class CharAscciPatternElevenUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		while(i<=n)
		{
			int j=1;
			int ascii=64+i;
			while(j<=i)
			{
				System.out.print((char)(ascii--)+" ");
			j++;
			}
			System.out.println();
			i++;
		}
	}
}