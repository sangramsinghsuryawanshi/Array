import java.util.*;
public class PetersonNumOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		int temp=n,rem=0,sum=0;
		while(temp!=0)
		{
			int i=1,fact=1;
			rem=temp%10;
			while(i<=rem)
			{
				fact=fact*i;
				i++;
			}
			sum+=fact;
			temp=temp/10;	
		}
		if(n==sum)
		{
			System.out.println("number is peterson");
		}
		else
		{
			System.out.println("number is not peterson");
		}
	}
}
			
	