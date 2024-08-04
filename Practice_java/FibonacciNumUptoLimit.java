import java.util.*;
public class FibonacciNumUptoLimit
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		int j=1,a=0,b=1,c=0,i=1;
		while(i<=n)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;			
		i++;
		}
	}
}