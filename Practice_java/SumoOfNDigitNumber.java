import java.util.*;
public class SumoOfNDigitNumber
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
		System.out.println("sum of n digit number between "+a+" To "+b+" using foor loop is:");
		for(int i=a;i<=b;i++)
		{
			int rem=0,temp=i,sum=0;
			for(;temp!=0;)
			{
				rem=temp%10;
				sum+=rem;
				temp=temp/10;
			}
				System.out.print(i+" = "+sum+" ,");
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int n =sc.nextInt();
		System.out.println("Enter Second number:");
		int n1 = sc.nextInt();
		System.out.println("sum of n digit number between "+n+" To "+n1+" using while loop is:");
		int j=n;
		while(j<=n1)
		{
			int rem1=0,temp1=j,sum1=0;
			while(temp1!=0)
			{
				rem1=temp1%10;
				sum1+=rem1;
				temp1=temp1/10;
			}
				System.out.print(j+" = "+sum1+" , ");
		j++;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter First number:");
		int m =sc.nextInt();
		System.out.println("Enter Second number:");
		int m1 = sc.nextInt();
		System.out.println("sum of n digit number between "+m+" To "+m1+" using do while loop is:");
		int k=m;
		do
		{
			int rem2=0,temp2=k,sum2=0;
			do
			{
				rem2=temp2%10;
				sum2+=rem2;
				temp2=temp2/10;
			}while(temp2!=0);
				System.out.print(k+" = "+sum2+" , ");
		k++;
		}while(k<=m1);
	}
}