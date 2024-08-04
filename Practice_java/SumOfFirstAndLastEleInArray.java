import java.util.*;
public class SumOfFirstAndLastEleInArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.print("\n--------------------------");
		int a[]=new int[size];
		System.out.print("\nEnter Array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n--------------------------");
		System.out.print("\n sum of 1st and last element in Array:");
		int sum=0,c=0,ind=0; 
		sum=a[0]+a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==sum)
			{
				c++;
				ind=i;
				break;		
			}	
		}
		if(c>0)
		{
			System.out.print("\n["+ind+"]"+sum); 
		}
		System.out.print("\n--------------------------");
	}
}
