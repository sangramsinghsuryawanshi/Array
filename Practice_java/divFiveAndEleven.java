import java.util.*;
public class divFiveAndEleven
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		if(n%5==0 && n%11==0)
		{
			System.out.println(n+" is divisible by 5 and 11");
		}
		else
		{
			System.out.println(n+ " is not divisible by 5 and 11");
		}
	}
}

