import java.util.*;
public class PrintArmstrongNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n = sc.nextInt();
		System.out.println("---------------------");
		int rem=0,rev=0;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev+=(rem*rem*rem);
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");

		}
	}
}