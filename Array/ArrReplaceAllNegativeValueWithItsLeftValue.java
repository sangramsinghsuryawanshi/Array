import java.util.*;
public class ArrReplaceAllNegativeValueWithItsLeftValue
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size= sc.nextInt();
		int []a= new int[size];
			for(int i=0;i<a.length;i++)
			{
				System.out.println("Enter "+i+" th value for array:");
				a[i]=sc.nextInt();
			}
				for(int i=0;i<a.length;i++)
				{
					if(a[i]<0)
					a[i]=a[i-1]*a[i-1];
				}
				
					System.out.println("replace all negative value with its immediate left elements square:");
					for(int i=0;i<a.length;i++)
					{
						System.out.print(a[i]+" ");

					}

			System.out.println("\nArray size: "+a.length);
	
	}
}