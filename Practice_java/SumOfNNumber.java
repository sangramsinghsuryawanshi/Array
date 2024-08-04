import java.util.*;
public class SumOfNNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("n integer number using for loop");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println("\nsum of n number in for loop is: "+sum);
		System.out.println("\n-----------------------------");
		System.out.println("n integer number using while loop");
		System.out.println("Enter n number");
		int n1 = sc.nextInt();
		int j=1,sum1=0;
		while(j<=n1)
		{
			System.out.print(j+" ");
			sum1+=j;
		j++;
		}
		System.out.println("\nsum of n number in while loop is: "+sum1);
		System.out.println("\n-----------------------------");
		System.out.println("n integer number using do while loop");
		System.out.println("Enter n number");
		int n2 = sc.nextInt();
		int k=1,sum2=0;
		do
		{
			System.out.print(k+" ");
			sum2+=k;
		k++;
		}while(k<=n2);
		System.out.println("\nsum of n number in do while loop is: "+sum2);
		System.out.println("\n-----------------------------");
	}
}

