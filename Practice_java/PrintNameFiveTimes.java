import java.util.*;
public class PrintNameFiveTimes
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String n = sc.next();
		System.out.println("---------------------");
		int i=1;
		while(i<=5)
		{
			System.out.println(n);
		i++;
		}
	}
}
		