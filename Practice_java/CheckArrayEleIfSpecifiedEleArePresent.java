import java.util.*;
public class CheckArrayEleIfSpecifiedEleArePresent
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
		int c=0,b=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==66)
			{
				c++;
			}
			else if(a[i]==77)
			{
				b++;
			}
		}
		if(c==0 && b==0)
		{
			System.out.println("\nBoth are not present");
		}
		else if(c==0 && b!=0)
		{
			System.out.println("\n77 are present");	
		}
		else if(c!=0 && b==0)
		{
			System.out.println("\n66 are present");	
		}
		else
		{
			System.out.println("Both are presnent");		
		}
	}
}

