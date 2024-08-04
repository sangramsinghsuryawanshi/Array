public class PatternEight
{
	public static void main(String[]ae)
	{
		int n=10;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i<=10 || j==2 && i>=2 && i<=8 || j==3 && i>=3 && i<=7 || j==4 && i>=4 && i<=6 || j==5 && i>=5 && i<=5)
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
	
