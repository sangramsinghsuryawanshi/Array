/*
Scanner : it is used for user input....
it is predefined class.it is use package java.util.Scanner.
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();//for integer input
long l = sc.nextLong();//for long input
double d = sc.nextDouble();//for Double input
String s = sc.next();//for String input
String s1 = sc.nextLine();//Whole Line
char c = sc.next().char.At(0);//for input of single charater.

*/
import java.util.Scanner;
public class ScannerClass
{
	public static void main(String[]args)
	{
		int a;
		float f;
		double d;
		long l;
		String s;
		char c;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter int Value :");
		a=sc.nextInt();
		System.out.println("Int value enterd by user: "+a);

		System.out.print("Enter float Value :");
		f=sc.nextFloat();
		System.out.println("Float value enterd by user: "+f);

		System.out.print("Enter Double Value :");
		d=sc.nextDouble();
		System.out.println("Double value enterd by user: "+d);

		System.out.print("Enter Long Value :");
		l=sc.nextLong();
		System.out.println("Long value enterd by user: "+l);

		System.out.print("Enter String Value :");
		s=sc.next();
		System.out.println("String value enterd by user: "+s);

		System.out.print("Enter Char Value :");
		c=sc.next().charAt(0);
		System.out.println("Int value enterd by user: "+c);
}
}



		
