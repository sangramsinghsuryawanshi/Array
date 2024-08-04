public class NumPatternFiveUsingFor
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=n;i>=1;i--) //
		{
			for(int j=i;j>=1;j--)//
			{
				System.out.print(j);
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++) //5
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}

		
	}
}