import java.util.*;
public class AddTwoNumIntoEachDigit
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number:");
		int n = sc.nextInt();
		System.out.println("\n----------------------");
		int rem=0,rev=0;
		for(int temp=n;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			rem+=2;
			rev=(rev*10)+rem;
		}
		int rem1=0,rev1=0;
		for(int temp=rev;temp!=0;temp=temp/10)
		{
			rem1=temp%10;
			rev1=(rev1*10)+rem1;
		}

		System.out.print("Given Number is :"+rev1);
		System.out.println("\n----------------------");
	}
}
