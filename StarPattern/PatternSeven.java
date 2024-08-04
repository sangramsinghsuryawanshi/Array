public class PatternSeven
{
	public static void main(String[]ae)
	{
		int n=14;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=7 && j<=7 || i==2 && j>=6 && j<=8 || i==3 && j>=5 && j<=9 || i==4 && j>=4 && j<=10 || i==5 && j>=3 && j<=11 || i==6 && j>=4 && j<=10 || i==7 && j>=5 && j<=9 || i==8 && j>=6 && j<=8 || i==9 && j>=7 && j<=7)
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
	
