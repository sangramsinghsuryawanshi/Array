import java.util.*;
public class TernaryOperatorPrintLargestOfThreeNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();
		System.out.println("Enter c number");
		int c = sc.nextInt();
		int maximum=(a>b)? ((a>c)?a:c):((b>c)?b:c);
		System.out.println("Max is:"+maximum);
	}
}