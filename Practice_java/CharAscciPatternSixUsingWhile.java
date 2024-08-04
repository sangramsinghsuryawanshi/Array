public class CharAscciPatternSixUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		while(i<=n)
		{
			int ascii=65;
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(ascii++)+" ");
			j++;
			}
			System.out.println();
		i++;
		}
	}
}