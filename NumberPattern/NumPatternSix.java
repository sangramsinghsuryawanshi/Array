public class NumPatternSix
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}