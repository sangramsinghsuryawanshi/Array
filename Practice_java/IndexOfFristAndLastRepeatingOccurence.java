import java.util.*;
public class IndexOfFristAndLastRepeatingOccurence
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
		System.out.print("Index of first occurrence and index of last occurrence is");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
 				if(a[i]==a[j])
				{
					c++;          
               	}

			}
			if(c==1)
			{
				System.out.print((i-2)+" "+a[i]+" ");
			}
		}
		System.out.println("\n------------------------");
	}
}
				