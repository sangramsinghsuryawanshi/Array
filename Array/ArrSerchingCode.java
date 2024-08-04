import java.util.*;
public class ArrSerchingCode
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
			System.out.println("Enter element which you to search:");
			int ele = sc.nextInt();
				int c=0;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==ele)
					{
					System.out.println(ele+" is present in array "+i+" size");
					}
					else
					{
					c++;
					
					}
	
				}
			if(c==0)
			{
				System.out.println(ele+" is not present in array size");
			}		
		System.out.println("Array size: "+a.length);
	
	}
}