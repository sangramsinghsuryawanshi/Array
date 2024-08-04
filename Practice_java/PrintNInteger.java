import java.util.*;
public class PrintNInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("n integer number using for loop");
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
		}
		System.out.println("\n-----------------------------");
		System.out.println("n integer number using while loop");
		System.out.println("Enter n number");
		int n1 = sc.nextInt();
		int j=1;
		while(j<=n1)
		{
			System.out.print(j);
		j++;
		}
		System.out.println("\n-----------------------------");
		System.out.println("n integer number using do while loop");
		System.out.println("Enter n number");
		int n2 = sc.nextInt();
		int k=1;
		do
		{
			System.out.print(k);
		k++;
		}while(k<=n2);
		System.out.println("\n-----------------------------");
	}
}

