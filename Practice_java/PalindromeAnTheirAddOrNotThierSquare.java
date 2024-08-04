import java.util.*;
public class PalindromeAnTheirAddOrNotThierSquare
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		int temp=n,rem=0,sum=0,sum1=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=rem;
			sum1+=rem;
			temp=temp/10;
		}
		if(rem==n)
		{
			System.out.println("Addition of "+n+" = "+sum);
			System.out.println("---------------------------------");
		}
		else if(rem!=n)
		{
			System.out.println("Addition of "+n+" = "+sum1);
		}
	}
}
			
/*Write a Java program to check if a given number is a palindrome and calculate the sum of its digits and number isnot palindrome then calculate sum of square of digits. Ex 1. : 121 : output 1+2+1 = 4 
 Ex 2. 223 : output : 4+4+9 = 17*/	