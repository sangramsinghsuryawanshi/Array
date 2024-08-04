import java.util.*;
public class ArrPrintZeroPositiveAndNegativeNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int []a= new int[5];
		System.out.print("Enter value for array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("_______________________________");
		System.out.println("zeros number from array:");
		int sum=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c++;
			}
		}
		System.out.println("Number of zeros in array element:"+c);
		System.out.println("_______________________________");
		
		System.out.println("Positive number from array:");
		int c1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				c1++;
			}
		}
		System.out.println("Positive Number From array :"+c1);
		System.out.println("_______________________________");
								
		System.out.println("Negative number from array:");
		int c2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				c2++;
			}
		}
		System.out.println("Negative Number From array :"+c2);
		System.out.println("_______________________________");
		
	}
}