import java.util.*;
public class NestedForLoopPrintFactorsOfNNum
{
	public static void main(String[]ae)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("Enter last number:");
		int n1 = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("given Factors of number "+n+" To "+n1+" is: ");
		System.out.println("--------------------------");
		
		for(int i=n;i<=n1;i++)
		{
			System.out.print("Factors of:"+i+"-->");
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					System.out.print(j+" ");
				}	
			}
			System.out.println();
		}

	}
}