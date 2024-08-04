import java.util.*;
public class PalindromeNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("Palindrome number between "+a+" To "+b+" is:");
		for(int i=a;i<=b;i++)
		{
			int rem=0,rev=0,temp=i;
			for(;temp!=0;)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}
			if(rev==i)
			{
				System.out.println(" "+i);
			}
		}
	}
}