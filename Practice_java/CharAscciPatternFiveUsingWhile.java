public class CharAscciPatternFiveUsingWhile
{
	public static void main(String[]ar)
	{
		int n=6;
		int i=1,num=n;
		while(i<=n)
		{
			int j=i;
			int ascii=65+num-1;
			while(j<=n)
			{
				System.out.print((char)(ascii--)+" ");
			j++;
			}
			System.out.println();
			i++;
			num--;
			
		}
		i=1;
		int c=n;
		while(i<=n)
		{
			int j=1;
			int ascii=70-(c-1);
			while(j<=i)
			{
				System.out.print((char)(ascii--)+" ");
			j++;
			}
			System.out.println();
			i++;
			c--;
			
		}

	}
}