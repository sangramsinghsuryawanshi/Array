import java.util.*;
public class BookReturnCharges
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter days being late:");
		int days = sc.nextInt();
		double fine = 0;

		if(days<=5)
		{
  			fine = 0.50*days;
		}
		else if(days>=6 && days<=10)
		{
			fine =(days-5)*1+(0.50*5);
		}
		else if(days>10)
		{
  			 fine = (days-10)*5 +1*5+0.5*5;
		}
		else
		{
  			System.out.println("Membership will be cancelled");
		}
		System.out.println(fine);
	}
}