import java.util.Scanner;
public class ArithmaticOperator{
	public static void main(String[]args){
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b Values :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		g=sc.nextInt();
		h=sc.nextInt();
		i=sc.nextInt();
		j=sc.nextInt();
		System.out.println("Enter Name :");
		String s=sc.next();
		System.out.println("Addition of" +a+ "and" +b+ "is :"+(a+b));
		
		System.out.println("Substration of" +c+ "and" +d+ "is :"+(c-d));
		
		System.out.println("Multiplication of" +e+ "and" +f+ "is :"+(e*f));

		System.out.println("Division of" +g+ "and" +h+ "is :"+(g/h));

		System.out.println("Reminder of" +i+ "and" +j+ "is :"+(i%j));

		System.out.println("Name is:"+s);
	}
}
