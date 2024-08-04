import java.util.*;
public class TernaryOperatorPrintPositiveNegativeOrEqualToZero
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println((a>0)?"a is positive number":(a<0)?"b is negative number":"number is equal to zero");
	}
}