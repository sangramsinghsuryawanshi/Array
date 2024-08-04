import java.util.Scanner;
public class NestedWhileLoopPrime
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int first = sc.nextInt();
		System.out.println("Enter n value:");
		int last = sc.nextInt();

		System.out.println("--------------------");
		System.out.println("Prime upto "+first+" is:");
		System.out.println("--------------------");
		int i=first;
		while(i<=last)
		{
			int j=1;
			int c=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
			j++;
			}

			if(c==2)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
}