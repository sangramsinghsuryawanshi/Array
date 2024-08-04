import java.util.*;
public class ArrayClassMethods
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------------");
		Integer a[]={1,2,3,4,5,2,8,7,2,1,23,56};
		System.out.println("Given Array is: "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());	
		System.out.println("Given Array is: "+Arrays.toString(a));
		Integer b[]=Arrays.copyOf(a,a.length);
		System.out.println("Copy of given original Array is: "+Arrays.toString(b));
	}
}