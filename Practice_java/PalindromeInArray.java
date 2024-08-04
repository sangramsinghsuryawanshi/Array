import java.util.*;
public class PalindromeInArray
{
	public static void main(String[]ar)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size= sc.nextInt();
		System.out.println("\n------------------------");
		int a[]= new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n------------------------");
		System.out.print("Palindrome number: ");
		for(int i=0;i<a.length;i++)
		{
			int c=0,rev=0,rem=0;
			for(int temp=a[i];temp!=0;temp=temp/10)
			{
 				rem=temp%10;
				rev=(rev*10)+rem;
			}
			if(rev==a[i])
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\n------------------------");
	}
}
				