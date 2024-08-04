public class CharAscciPatternSevenUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		while(i<=n)
		{
			int ascii=70;
			int j=i;
			while(j<=n)
			{
				System.out.print((char)(ascii--)+" ");
			j++;
			}
			System.out.println();
			i++;
		}
	}
}