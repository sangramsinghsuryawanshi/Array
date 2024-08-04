import java.util.*;
public class AreaOfTriangle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth:");
		int b= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter hight:");
		int h= sc.nextInt();
		System.out.println("---------------------");
		if(b!=0 && h!=0)
		{
			int area=b*h*1/2;
			System.out.println("Area of triangle is: "+area);
		}
		else
		{
			System.out.println("Enter valid breadth and height");
		}
	}
}