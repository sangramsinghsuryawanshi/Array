import java.util.*;
public class TernaryOperatorPrintEvenOrOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		String comp=(a%2==0)?"Number is even":"number is odd";
		System.out.println("------------\n"+comp);
	}
}