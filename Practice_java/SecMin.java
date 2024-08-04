import java.util.*;
public class SecMin
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		int rem=0,min=10,smin=10;
		while(n!=0)
		{
			rem=n%10;
			if(min>rem)
			{
				smin=min;
				min=rem;
			}
			else if(smin>rem && rem!=min)
			{
				smin=rem;
			}	
			n=n/10;
		}
		System.out.println(min);
		System.out.println(smin);
	}
}