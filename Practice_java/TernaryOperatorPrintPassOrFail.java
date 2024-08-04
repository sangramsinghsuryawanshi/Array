import java.util.*;
public class TernaryOperatorPrintPassOrFail
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int a = sc.nextInt();
		String comp=(a>=60)?"pass":"fail";
		System.out.println("------------\n"+comp);
	}
}