public class NumPatternFifthUsingWhileLoop
{
	public static void main(String[]ar)
	{
		int n=5,i=n;
		while(i>=1)
		{
			int j=1;
			 j=i;
			while(j>=1)
			{
				System.out.print(j+" ");
			j--;
			}
		System.out.println();
		i--;
		}
		int k=5,s=1;
		while(s<=k)
		{
			int j=1;
			j=s;
			while(j<=k)
			{
				System.out.print(j+" ");
			j++;
			}
		System.out.println();
		s++;
		}

	}
}