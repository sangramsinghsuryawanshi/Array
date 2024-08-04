import java.util.*;
public class EquilibriumPoint
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("\n----------------------");
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("\n----------------------");
		System.out.print("Equilibrium point is : ");
		for(int i=0;i<a.length;i++)
		{
			int lsum=0,rsum=0;
			for(int j=0;j<i;j++)
			{
				lsum+=a[j];	
			}
			for(int k=i+1;k<a.length;k++)
			{
				rsum+=a[k];
			}
			if(lsum==rsum)
			{
				System.out.print(a[i-1]);
			}		
		}
		System.out.println("\n----------------------");
	}
}
		