import java.util.*;
public class PrintMonthNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week number");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:System.out.println(n+" it's a January");
			break;
			case'2':System.out.println(n+" it's a February");
			break;
			case'3':System.out.println(n+" it's a March");
			break;
			case'4':System.out.println(n+" it's a April");
			break;
			case'5':System.out.println(n+" it's a may");
			break;
			case'6':System.out.println(n+" it's a June");
			break;
			case'7':System.out.println(n+" it's a July");
			break;
			case 8:System.out.println(n+" it's a August");
			break;
			case 9:System.out.println(n+" it's a September");
			break;
			case 10:System.out.println(n+" it's a October");
			break;
			case 11:System.out.println(n+" it's a November");
			break;
			case 12:System.out.println(n+" it's a December");
			break;

			default:System.out.println(n+" invalid day");
			break;


		}
		
	}
}

