import java.util.*;
public class RemoveDuplicateArrayEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int c[] = new int[size];
		System.out.print("\nEnter array elements : ");	
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			
		}
		System.out.print("\nDescending array elements : ");	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
		}
		System.out.print("\n----------------------------");
	}
}	
		