import java.util.*;
public class DuckNumberInArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter  n number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println("Given number is not duck number");
		}
		else if(c==a.length)
		{
			System.out.println("Given number is not duck number");
		}
		else
		{
			System.out.println("Given number is duck number");
		}
	}
}
		