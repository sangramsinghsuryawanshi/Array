import java.util.*;
public class FibonacciFirstNNumAdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("Enter n add number");
		int n1 = sc.nextInt();
		int i=1,a=0,b=1,sum=0,c=0,j=3;
		while(i<=n)
		{
			c=a+b;
			if(i>n-n1)
			{
				sum+=a;
			}
			System.out.println(a);
			a=b;
			b=c;
		i++;
		}
		System.out.println(sum);
	}
}