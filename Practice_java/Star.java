import java.util.*;
public class Star
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int no = sc.nextInt();
		System.out.println("Enter given number:");
		int i = sc.nextInt();
		//System.out.println("Enter your name:");
		//String name = sc.next();
		System.out.println("---------------------");
		int rem=0,min=10,max=0,rev=0,sum=0,count=0,count1=0,no1=121,temp=no1,n=10;
		while(no!=0)
		{
			rem=no%10;
			if(max<rem)
			{
				max=rem;
			}
			else if(min>rem)
			{
				min=rem;
			}
			count++;
			no=no/10;
		}
		System.out.println("Given max number is :"+max);
		System.out.println("Given min number is :"+min);
		System.out.println("Given count number is :"+count);
		System.out.println("-------------------------");
		while(no1!=0)
		{
			rem=no1%10;
			rev=(rev*10)+rem;
			sum+=rem;
			count1++;
			no1=no1/10;
			
		}
		System.out.println("Palidrome Number:"+rev);
		System.out.println("-------------------------");
			if(temp==no1)
			{
				System.out.println("Number is palidrome");

			}
			else
			{
				
				System.out.println("Number is palidrome");
			}
			System.out.println("Given sum number is :"+sum);
			System.out.println("-------------------------");
			System.out.println("Given count number is :"+count1);
		while(i<=n)
		{
			
			if(i%2==0)
			{
				System.out.println(i+"<");
			}
			else if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}