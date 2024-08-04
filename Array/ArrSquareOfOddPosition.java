import java.util.*;
public class ArrSquareOfOddPosition
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size= sc.nextInt();
		int []a= new int[size];
			for(int i=0;i<a.length;i++)
			{
				System.out.print("Enter "+i+" th value for array:");
				a[i]=sc.nextInt();
			}
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2!=0)
					a[i]=a[i]*a[i];
				}
				
					System.out.println("\nSqure of odd element");
					for(int i=0;i<a.length;i++)
					{
						System.out.print(a[i]+" ");

					}

			System.out.println("\nArray size: "+a.length);
	
	}
}