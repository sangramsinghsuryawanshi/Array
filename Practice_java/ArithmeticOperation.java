import java.util.*;
public class ArithmeticOperation
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();
		System.out.println("Addition :"+(a+b));		
		System.out.println("Substration :"+(a-b));			
		System.out.println("Multiplication :"+(a*b));			
		System.out.println("Division :"+(double)(a/b));
		System.out.println("Reminder :"+(double)(a%b));		
	}
}