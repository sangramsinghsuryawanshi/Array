public class PatternTen
{
	public static void main(String[]ae)
	{
		int n=11;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=5 && j<=10 || i==2 && j>=4 && j<=9 || i==3 && j>=3 && j<=8 || i==4 && j>=2 && j<=7 || i==4 && j>=1 && j<=6)
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
	
