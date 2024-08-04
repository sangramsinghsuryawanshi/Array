
import java.util.Scanner;
public class WhileDoWhileForLoopUsingPalidrome
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
		int i=1,j=1,k=1,rem=0,rem1=0,rem2=0,rev=0,rev1=0,rev2=0,temp=n,temp=n1,temp=n2;
		System.out.println("Reverse number using while loop :");
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("**********************************************");
		System.out.println("Reverse number using do while loop :");
		do
		{
			rem1=j%10;
			rev1=(rev1*10)+rem1;
			j=j/10;

		}while(n1!=0);
		System.out.println("**********************************************");
		System.out.println("Palindrome number using for loop :");
		for(int k=n2;i!=0; k=k/10)//for(;n!=0;)
		{
			rem2=k%10;
			rev2=(rev2*10)+rem2;
		}
		System.out.println("Reverse of given number is: "+rev2);
		System.out.println("--------------------------------------");
			if(temp2==rev2)
			{
				System.out.println("number is palindrome:");
			}
			else
			{
				System.out.println("number is not palindrome:");
			}

		System.out.println("**********************************************");
	}
}

/*Write a Java program to generate and print the first 10 prime numbers using a for loop.
 Write a program to check if a given number is a palindrome or not using a while loop.
 Write a Java program to print the multiplication table of a given number using a for loop.
 Write a program to check if a given number is an Armstrong number or not using a while loop.
 Write a Java program to find the factors of a given number using a for loop.*/