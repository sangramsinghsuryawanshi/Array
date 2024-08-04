import java.util.*;
public class SecMax
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  n number:");
		int n= sc.nextInt();
		int rem=0,max=0,smax=0;
		while(n!=0)
		{
			rem=n%10;
			if(max<rem)
			{
				smax=max;
				max=rem;
			}
			else if(smax<rem && rem!=max)
			{
				smax=rem;
			}
			n=n/10;
		}
		System.out.println(max);
		System.out.println(smax);
	}
}
				