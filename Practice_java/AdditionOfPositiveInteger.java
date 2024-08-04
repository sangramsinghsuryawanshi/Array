import java.util.*;
public class AdditionOfPositiveInteger
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int i=-1,sum=0;
		while(i!=0)
		{
			System.out.println("enter n number :");
			i = sc.nextInt();
			if(i<0)
			{
				continue;
			}
			sum+=i;
		}
		System.out.println("Sum of n positive number:"+sum);
	}
}