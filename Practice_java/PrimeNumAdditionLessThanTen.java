import java.util.*;
public class PrimeNumAdditionLessThanTen
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("Enter n1 number");
		int n1 = sc.nextInt();
		int i=n,sum1=0;
		while(i<=n1)
		{
			int j=1,c=0;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
			j++;
			}
			
			if(c==2)
			{
				int temp=i,rem=0;
				int sum=0;
					while(temp!=0)
					{
						rem=temp%10;
						sum+=rem;
						temp=temp/10;
					}
					if(sum>10)
					{
						System.out.println(i+" = "+sum);
						sum1+=i;
					}
			}

			
		i++;	
		}
		System.out.println("----------------------------\n "+sum1);
		
	}
}
			
	