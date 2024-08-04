public class CharAscciPatternIncreByOne
{
	public static void main(String[]ar)
	{
		int n=10,c=1;
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
			i++;
		}
	}
}