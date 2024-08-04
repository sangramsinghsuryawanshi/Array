public class PatternFour
{
	public static void main(String[]ae)
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=5 || i==2 && j>=2 && j<=5 || i==3 && j>=3 && j<=5 || i==4 && j>=4 && j<=5 || i==5 && j>=5 && j<=5)
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
	
