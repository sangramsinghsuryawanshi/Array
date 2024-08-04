import java.util.*;
public class MagicMatix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]={{1,2,1},{1,1,1},{1,1,1}};
		System.out.println("Given matix is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("\n--------------------------------");
		int rsum=0,csum=0,dsum=0,sdsum=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			rsum=0;
			csum=0;
			for(int j=0;j<a[i].length;j++)
			{
				rsum+=a[i][j];
				csum+=a[j][i];
				if(i==j)
				{
					dsum+=a[i][j];
				}
				if((i+j)==(a.length-1))
				{
					sdsum+=a[i][j];
				}
			}
			if(rsum!=csum)
			{
				c=1;
				break;
			}
		}
		if(c==0 && dsum!=sdsum)
		{
			System.out.print("Given matrix is Magic matrix");
		}
		else
		{
			System.out.print("Given matrix is Not Magic matrix");
		}
		System.out.println("\n-----------------------------------------");
	}
}

				