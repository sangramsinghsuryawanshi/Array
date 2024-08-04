import java.util.*;
public class TernaryOperatorPrintBooleanTrueOrFalse
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter True/false only");
		boolean a = sc.nextBoolean();
		String comp=(a==true)?"yes":"no";
		System.out.println("------------\n"+comp);
	}
}