import java.util.Scanner;
public class WhileDoWhileForLoopUsingOddSum
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
		int sum=0,sum1=0,sum2=0,rem=0,rem1=0,rem2=0;
		System.out.println("odd number upto n number using while loop :");
		while(n!=0)
		{
			rem=n%10;
			if(rem%2!=0)
			{
				System.out.println(rem);
				sum+=rem;
			}
			n=n/10;
		}
		System.out.println("--------------------------------------------");
		System.out.println("odd number sum upto n number using while loop : "+sum);
		System.out.println("**********************************************");
		System.out.println("odd number upto n number  using do while loop :");
		do
		{
			rem1=n1%10;
			if(rem1%2!=0)
			{
				System.out.println(rem1);
				sum1+=rem1;
			}
			n1=n1/10;

		}while(n1!=0);
		System.out.println("--------------------------------------------");
		System.out.println("odd number sum upto n number using do while loop : "+sum1);
		System.out.println("**********************************************");
		System.out.println("odd number upto n number using for loop :");
		for(;n2!=0;)
		{
			rem2=n2%10;
			if(rem2%2!=0)
			{
				System.out.println(rem2);
				sum2+=rem2;
			}
			n2=n2/10;
			
		}
		System.out.println("--------------------------------------------");
		System.out.println("odd number sum upto n number using for loop : "+sum2);
		System.out.println("**********************************************");
	}
}