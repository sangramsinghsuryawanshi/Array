import java.util.*;
public class PrintSecondLargestNumInNNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("---------------------");
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
		System.out.println("Max is: "+max+" \nScecond Max is: "+smax);
	}
}
			