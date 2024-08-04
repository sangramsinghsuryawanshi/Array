import java.util.Scanner;
public class WhileDoWhileForLoopUsingPrimeOrNot
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
		int c=0,c1=0,c2=0,i=1,j=1;
		System.out.println("Check number is prime or not using while loop :");
		while(i<=n)
		{
			if(n%i==0)
			{
				c++;
			}
			i++;

		}
		System.out.println("--------------------------------------------");
		if(c==2)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is not Prime");
		}
		System.out.println("**********************************************");
		System.out.println("Check number is prime or not using do while loop :");
		do
		{
			if(n1%j==0)
			{
				c1++;
			}
			j++;

		}while(j<=n1);
		System.out.println("--------------------------------------------");
		if(c1==2)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is not Prime");
		}
		
		System.out.println("**********************************************");
		System.out.println("Check number is prime or not using for loop :");
		for(int k=1;k<=n2;k++)
		{
			if(n2%k==0)
			{
				c2++;
			}
			
		}
		System.out.println("-------------------------------------------------");
		if(c2==2)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is not Prime");
		}
		System.out.println("--------------------------------------------");
	}
}