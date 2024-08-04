import java.util.Scanner;
public class WhileDoWhileForLoopUsingNatural
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given n number for while loop");
		int n = sc.nextInt();	
		System.out.println("--------------------------------------------");
		System.out.println("Enter given n number for do while loop");
		System.out.println("--------------------------------------------");
		int n1 = sc.nextInt();	
		System.out.println("--------------------------------------------");
		System.out.println("Enter given n number for for loop");
		int n2 = sc.nextInt();	
		System.out.println("--------------------------------------------");
		int i=1,j=1,k=1;
		System.out.println("Natural number upto n given number using while loop :");
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("**********************************************");
		System.out.println("Natural number upto n given number using do while loop :");
		do
		{
			System.out.println(j);
			j++;
		}while(j<=n1);
		System.out.println("**********************************************");
		System.out.println("Natural number upto n given number using for loop :");
		for(k=1;k<=n2;k++)
		{
			System.out.println(k);
		}
		System.out.println("**********************************************");
	}
}
