import java.util.*;
public class AreaAndParameterOfCircle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double a = sc.nextDouble();
		double area=Math.PI*(a*a);
		double param=2*(Math.PI*a);
		System.out.println("Area of circle is:"+area);		
		System.out.println("Parameter of circle is:"+param);		
				
	
	}
}