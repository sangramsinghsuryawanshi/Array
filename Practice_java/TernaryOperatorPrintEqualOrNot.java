import java.util.*;
public class TernaryOperatorPrintEqualOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		String comp=(a==b)?"Number is equal":"number is not equal";
		System.out.println("------------\n"+comp);
	}
}