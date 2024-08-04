public class NumPatternFifteen
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=n;i>=1;i--) 
		{
			for(int k=n;k>=i-1;k--)
			{
				System.out.print(k);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}