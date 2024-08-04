import java.util.*;
public class PrintSecondMinimumNumInNNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("---------------------");
		int rem=0,min=10,smin=10;
		while(n!=0)
		{
			rem=n%10;
			if(rem<min)
			{
				smin=min;
				min=rem;
			}
			else if(rem<smin && min!=0)
			{
				smin=rem;	
			}
			n=n/10;
		}
		System.out.println("Min is: "+min+" \nScecond Min is: "+smin);
	}
}
