import java.util.*;
public class FactorsGivenNumUptoNNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		System.out.println("Enter n1 number");
		int n1 = sc.nextInt();
		System.out.println("---------------------------------");
		int i=n;
		while(i<=n1)
		{
			System.out.print("Factors of "+i+" is ---->");
			int j=1;
			while(j<=i)
			{
				if(i%j==0)
				{
					System.out.print(","+j);
				}
				j++;				
			}
		i++;
		System.out.println();
		}
		
	}
}