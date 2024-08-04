public class NumPatternFourUsingFor
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=n;i>=1;i--) //
		{
			for(int j=1;j<=i;j++)//
			{
				System.out.print(j);
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++) //5
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}

		
	}
}