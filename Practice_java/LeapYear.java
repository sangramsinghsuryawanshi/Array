import java.util.*;
public class LeapYear
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int n = sc.nextInt();
		if(n%4==0)
		{
			System.out.println(n+" Leap year");
		}
		else
		{
			System.out.println(n+ " is not leap year");
		}
	}
}

