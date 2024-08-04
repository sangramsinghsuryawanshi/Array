import java.util.*;
public class RandomeShuffle
{
	public static void main(String[]ar)
	{	
		Scanner sc = new Scanner(System.in);
		Random obj = new Random();
		int a[]={1,2,3,4,5};
		System.out.print("Given array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n------------------------");
		for(int i=0;i<a.length;i++)
		{
			int ind = obj.nextInt(a.length);
			System.out.println(i+" <--index "+ind+" <--ind change ");
			int t = a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		System.out.println("\n------------------------");
		System.out.print("Shuffle array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n------------------------");
	}
}
			