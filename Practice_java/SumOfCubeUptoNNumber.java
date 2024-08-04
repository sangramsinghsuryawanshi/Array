import java.util.*;
public class SumOfCubeUptoNNumber
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
			int j=1,c=0,sum=0;
			while(j<=i)
			{
				sum+=(i*i*i);
			j++;
			}
			System.out.println(i+" = "+sum);
			sum1+=sum;
		i++;
		}
			System.out.println("------------------------------\n "+sum1);
	}
}
			