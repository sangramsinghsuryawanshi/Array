public class NumPatternThreeUsingFor
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=1;i<=n;i++) //5
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		for(int i=n;i>=1;i--) //5
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}

		
	}
}