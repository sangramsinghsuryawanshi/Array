public class ContinueDemo
{
	public static void main(String[]ar)
	{
		int j=20;
		for(int i=1;i<=j;i++)
		{
			if(i>10 && i<15)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}