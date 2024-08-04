import java.util.Scanner;
public class BitwiseAndOrOperator
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		System.out.println("Bitwise OR Operator------>"+(a>b | a<b));
		System.out.println("Bitwise AND Operator------>"+(a>=b & a<=b));
		System.out.println("Bitwise OR Operator------>"+(a==b | b==a));
		System.out.println("Bitwise AND Operator------>"+(a!=b & b!=a));
	}
}

	