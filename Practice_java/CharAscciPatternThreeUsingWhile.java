public class CharAscciPatternThreeUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1;
		while(i<=n)
		{
			int j=1;
			int ascii=65;
			while(j<=i)
			{
				System.out.print((char)(ascii++)+" ");
			j++;
			}
			System.out.println();
			i++;
			
		}
		i=1;
		while(i<=n)
		{
			int j=n;
			int ascii=65;
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