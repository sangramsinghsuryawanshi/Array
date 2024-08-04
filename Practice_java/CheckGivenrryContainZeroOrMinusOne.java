import java.util.*;
public class CheckGivenrryContainZeroOrMinusOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("\n----------------------------");
		int a[]= new int[size];
		System.out.print("Enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------------");
		System.out.print("Enterd given array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------------");
		int b=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c++;				
			}
			else if(a[i]==-1)
			{
				b++;				
			}
			
		}
		if(c==0 && b==0)
		{
			System.out.println("Both are not present");		
		}
		else if(c!=0 && b==0)
		{
			System.out.println("Zero are present and -1 not presnent");	
		}
		else
		{
			System.out.println("Both are presnent");		
		}
	}
}

