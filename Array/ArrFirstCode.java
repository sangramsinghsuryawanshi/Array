import java.util.*;
public class ArrFirstCode
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int []a=new int[size];
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Enter "+i+" th value for array:");
				a[i]=sc.nextInt();
			}
				System.out.println("Even Number:");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==0)
					System.out.println(a[i]);
				}
				System.out.println("Odd Number:");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2!=0)
					System.out.println(a[i]);
				}

		
		System.out.println("Array size: "+a.length);
	
	}
}