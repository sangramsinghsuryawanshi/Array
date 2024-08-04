public class PatternSName
{
	public static void main(String[]ae)
	{
		int n=12;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=5 || i==2 && j>=1 && j<=1 || i==3 && j>=1 && j<=1 || i==4 && j>=1 && j<=1 || i==5 && j>=1 && j<=5 || i==6 && j>=5 && j<=5 || i==7 && j>=5 && j<=5 || i==8 && j>=5 && j<=5 || i==9 && j>=1 && j<=5)
				{
					System.out.print("*");
				}
				else if(i==1 && j>=1 && j<=1 || i==2 && j>=2 && j<=2 || i==3 && j>=3 && j<=3 || i==4 && j>=4 && j<=4 || i==5 && j>=5 && j<=5 || i==6 && j>=6 && j<=6 || i==5 && j>=7 && j<=7 || i==4 && j>=8 && j<=8 || i==3 && j>=9 && j<=9 || i==2 && j>=10 && j<=10 || i==1 && j>=11 && j<=11)
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
	
