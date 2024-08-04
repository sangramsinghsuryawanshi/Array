public class IncrementPattern
{
	public static void main(String[]ae)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
j---
j1
j1 j2
j1 j2 j3
j1 j2 j3 j4
j1 j2 j3 j4 j5

i---

i1 j1
i2 j1 j2
i3 j1 j2 j3
i4 j1 j2 j3 j4
i5 j1 j2 j3 j4 j5
*/