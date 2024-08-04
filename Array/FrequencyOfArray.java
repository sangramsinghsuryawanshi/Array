import java.util.*;
public class FrequencyOfArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("\n--------------------------");
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n--------------------------");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.println("Array element = "+a[i]+" And their count is = "+c);
			}
		}
		System.out.println("\n--------------------------");
	}
}