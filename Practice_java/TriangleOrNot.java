import java.util.*;
public class TriangleOrNot
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First side of triangle");
		int n = sc.nextInt();
		System.out.println("Enter second side of triangle");
		int n1 = sc.nextInt();
		System.out.println("Enter third side of triangleeture");
		int n2 = sc.nextInt();
		int tot=n+n1+n2;
		if(tot==180)
		{
			System.out.println("It's a triangle");
		}
		else
		{
			System.out.println("It's a not triangle");
		}
	}
}

