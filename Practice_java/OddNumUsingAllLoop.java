import java.util.*;
public class OddNumUsingAllLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("n odd number using for loop");
		int sum=0,c=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
				sum+=i;
				c++;
			}
		}
		System.out.println("\nsum of odd number for loop is: "+sum);
		System.out.println("\nsum of odd number count for loop is: "+c);

		System.out.println("\n-----------------------------");
		System.out.println("n odd number using while loop");
		System.out.println("Enter n number");
		int n1 = sc.nextInt();
		int j=1,sum1=0,c1=0;
		while(j<=n1)
		{
			if(j%2!=0)
			{
				System.out.print(j+" ");
				sum1+=j;
				c1++;
			}
		j++;
		}
		System.out.println("\nsum of odd number in while loop is: "+sum1);
		System.out.println("\nsum of odd number count while loop is: "+c1);
		System.out.println("\n-----------------------------");
		System.out.println("n odd number using do while loop");
		System.out.println("Enter n number");
		int n2 = sc.nextInt();
		int k=1,sum2=0,c2=0;
		do
		{
			if(k%2!=0)
			{
				System.out.print(k+" ");
				sum2+=k;
				c2++;
			}
		k++;
		}while(k<=n2);
		System.out.println("\nsum of odd number in do while loop is: "+sum2);
		System.out.println("\nsum of odd number count do while loop is: "+c2);
		System.out.println("\n-----------------------------");
	}
}

