import java.util.*;
public class AreaOfTriangleOfThreeSides
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side value of triangle:");
		int f= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter second side value of triangle:");
		int se= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter third side value of triangle:");
		int t= sc.nextInt();
		System.out.println("---------------------");

		if(f!=0 && se!=0 && t!=0)
		{
			int s=(f+se+t)/2;
			double area=(s*(s-f)*(s-se)*(s-t));
			System.out.println("Area of triangle is: "+Math.sqrt(area));
		}
		else
		{
			System.out.println("Enter valid three side of triangle");
		}
	}
}