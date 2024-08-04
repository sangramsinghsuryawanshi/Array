import java.util.*;
public class Decision
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 number:");
		int n1 = sc.nextInt();
		System.out.println("Enter n2 number:");
		int n2 = sc.nextInt();
		System.out.println("Enter n3 number:");
		int n3 = sc.nextInt();

		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is maximum");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is maximum");
		}
		else
		{
			System.out.println("n3 is maximum");
		}



	}
}