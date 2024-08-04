import java.util.*;
public class NestedForLoopPrintPrimeNumCheck
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		int c=0;
		for(int i=1;i<=100;i++)
		{
			
			if(n%i==0)
			{
				c++;
			}	
		}
			if(c==2)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
			System.out.println("--------------------------");
	}
}