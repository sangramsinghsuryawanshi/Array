import java.util.*;
public class FristEvenAndSecondOddInArray
{
	public static void main(String[]ar)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size= sc.nextInt();
		System.out.println("\n------------------------");
		int a[]= new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n------------------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
 				if(a[i]%2!=0)
				{
               				int temp=a[i];
                 			a[i]=a[j];
                			a[j]=temp;
               			 }

			}
		}
		System.out.print("even and odd array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n------------------------");
	}
}
				