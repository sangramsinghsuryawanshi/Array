public class PatternEight1
{
	public static void main(String[]ar)
	{
		int n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=1 || i==2 && j>=1 && j<=2 || i==3 && j>=1 && j<=3 || i==4 && j>=1 && j<=4 || i==5 && j>=1 && j<=5 || i==6 && j>=1 && j<=4 || i==7 && j>=1 && j<=3 ||i==8 && j>=1 && j<=2 || i==9 && j>=1 && j<=1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}