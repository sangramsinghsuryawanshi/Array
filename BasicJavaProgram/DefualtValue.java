public class DefualtValue
{
	static boolean b;
	static byte by;
	static char c;
	static int i;
	static float f;
	static double d;
	static short s;
	static long l;
	int a=2;
		void disp()
		{
		if(a%3==0)
		{
			System.out.println("number is even: "+a);
		}
		else
		{
			System.out.println("number is odd: "+a);
	
		}
		}

public static void main(String[]args)
{
	DefualtValue d = new DefualtValue();
	d.disp();
	System.out.println("Defualt value of boolean :"+b);

	System.out.println("Defualt value of byte :"+by);

	System.out.println("Defualt value of char :"+c);
	
	System.out.println("Defualt value of int :"+i);
	
	System.out.println("Defualt value of float :"+f);
	
	System.out.println("Defualt value of double :"+d);

	System.out.println("Defualt value of short :"+s);
	
	System.out.println("Defualt value of long :"+l);
}
}

