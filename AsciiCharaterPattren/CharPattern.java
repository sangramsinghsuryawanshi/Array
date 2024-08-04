public class CharPattern
{
	public static void main(String[]ar)
	{
		int n=5;
		int ascci=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=1 && j<=1)
				{
					System.out.print((char)ascci+" ");
				}
				else if(i==2 && j>=1 && j<=2)
				{
					System.out.print((char)ascci+" ");
				}
				else if(i==3 && j>=1 && j<=3)
				{
					System.out.print((char)ascci+" ");
				}
				else if(i==4 && j>=1 && j<=4)
				{
					System.out.print((char)ascci+" ");
				}
				else if(i==5 && j>=1 && j<=5)
				{
					System.out.print((char)ascci+" ");
				}
			}
			ascci++;
			System.out.println();
		}
	}
}