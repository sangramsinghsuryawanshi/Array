import java.util.Scanner;
public class WhileDoWhileForLoopUsingFactorial
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int fact=1,fact1=1,fact2=1;
		System.out.println("Enter given n number for while loop");
		int n = sc.nextInt();	
		System.out.println("--------------------------------------------");
		System.out.println("Enter given n number for do while loop");
		System.out.println("--------------------------------------------");
		int n1 = sc.nextInt();	
		System.out.println("Enter given n number for for loop");
		int n2 = sc.nextInt();	
		int i=1,j=1,k=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Factorial of given number using while loop :"+fact);
		do
		{
			fact1=fact1*j;
			j++;
		}while(j<=n1);
		System.out.println("**********************************************");
		System.out.println("Factorial of given number using do while loop :"+fact1);
		for(k=1;k<=n2;k++)
		{
			fact2=fact2*k;
		}
		System.out.println("**********************************************");
		System.out.println("Factorial of given number using for loop :"+fact2);
	}
}

