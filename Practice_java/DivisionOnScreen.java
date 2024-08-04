import java.util.*;
public class DivisionOnScreen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();			
		System.out.println(a+" / "+b+" = "+(double)(a/b));	
	}
}