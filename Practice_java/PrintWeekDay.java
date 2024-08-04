import java.util.*;
public class PrintWeekDay
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week number");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:System.out.println(n+" it's a monday");
			break;
			case'2':System.out.println(n+" it's a Tuesday");
			break;
			case'3':System.out.println(n+" it's a Wednesday");
			break;
			case'4':System.out.println(n+" it's a Thursday");
			break;
			case'5':System.out.println(n+" it's a Friday");
			break;
			case'6':System.out.println(n+" it's a Saturday");
			break;
			case'7':System.out.println(n+" it's a Sunday");
			break;
			default:System.out.println(n+" invalid day");
			break;


		}
		
	}
}

