import java.util.*;
public class FindFirstEleThatOccursKthTimes
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		System.out.print("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n----------------------");
		System.out.print("Enter n value :");
		int n = sc.nextInt();
		System.out.println("\n----------------------");
		System.out.print("Enter k number :");
		int k = sc.nextInt();
		System.out.println("\n----------------------");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(a[j]==n)
					{
						c++;
					}
					if(a[i]==n)
					{
						c++;
					}

				}
			}
			if(c==k)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\n----------------------");
	}
}