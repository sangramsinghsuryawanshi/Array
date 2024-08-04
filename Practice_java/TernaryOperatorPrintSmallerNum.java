import java.util.*;
public class TernaryOperatorPrintSmallerNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println(a>b?"a is grater then b":"b is grater than a");
	}
}