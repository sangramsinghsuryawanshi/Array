public class PatternNineIf
{
	public static void main(String[]ar)
	{
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=5 && j<=5 || i==2 && j>=4 && j<=5 || i==3 && j>=3 && j<=5 || i==4 && j>=2 && j<=5 || i==5 && j>=1 && j<=5 || i==6 && j>=2 && j<=5 || i==7 && j>=3 && j<=5 ||i==8 && j>=4 && j<=5 || i==9 && j>=5 && j<=5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}