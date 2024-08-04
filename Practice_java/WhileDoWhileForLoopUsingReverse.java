
import java.util.Scanner;
public class WhileDoWhileForLoopUsingReverse
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
		int i=1,j=1,k=1,rem=0,rem1=0,rem2=0;
		System.out.println("Reverse number using while loop :");
		while(n!=0)
		{
			rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		System.out.println("**********************************************");
		System.out.println("Reverse number using do while loop :");
		do
		{
			rem1=n1%10;
			System.out.println(rem1);
			n1=n1/10;
		}while(n1!=0);
		System.out.println("**********************************************");
		System.out.println("Reverse number using for loop :");
		for(;n2!=0;)
		{
			rem2=n2%10;
			System.out.println(rem2);
			n2=n2/10;
			
		}
		System.out.println("**********************************************");
	}
}
