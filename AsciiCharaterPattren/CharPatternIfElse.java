public class CharPatternIfElse
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int ascci=65;
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=6)
				{
					System.out.print((char)ascci+"");
				}
				else if(i==2 && j>=2 && j<=5)
				{
					System.out.print((char)ascci+"");
				}
				else if(i==3 && j>=3 && j<=5)
				{
					System.out.print((char)ascci+"");
				}
				else if(i==4 && j>=4 && j<=5)
				{
					System.out.print((char)ascci+"");
				}
				else if(i==5 && j>=5 && j<=5)
				{
					System.out.print((char)ascci+"");
				}
				else 
				{
					System.out.print(" ");
				}
				ascci++;
			}
			System.out.println();
		}
	}
}