import java.util.*;
public class DriverInsurance
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int n = sc.nextInt();
		System.out.println("Enter (m/f)");
		char n1 = sc.next().charAt(0);
		System.out.println("Enter Married status (y/n)");
		char n3 = sc.next().charAt(0);
		if(n3=='y')
		{
			System.out.println("Driver is married and insurance criteria is valid");
		
		 if(n3=='n' && n1=='m' && n>=30)
		{
			System.out.println(" driver is unmarried, male & above 30 years of age  insurance criteria is valid");
		}
		else
		{
			System.out.println("the driver is unmarried, & male less 25 years of age  insurance criteria is not valid");
		}

		}
		else if(n3=='n' && n>=25)
		{
			
		if(n1=='f')
		{
			System.out.println("the driver is unmarried, female & above 25 years of age  insurance criteria is valid");
		}
		else
		{
			System.out.println("the driver is unmarried, & female less 25 years of age  insurance criteria is not valid");
		}
		}
		else
		{
			System.out.println("hk");
		}

	}
}

