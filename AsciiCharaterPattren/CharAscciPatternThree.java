/*A A A A A
B B B B
C C C
D D
E

E E E E E
D D D D
C C C
B B
A
*/
public class CharAscciPatternThree
{
	public static void main(String[]ar)
	{
		int n=5;
		int ascii=69;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)ascii+" ");
			}
			ascii--;
			System.out.println();
		}
	}
}