public class CharAscciPatternTwoUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		int ascii=65;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((char)ascii+" ");
			j++;
			}
			System.out.println();
			i++;
			ascii++;
		}
	}
}