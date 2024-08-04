public class UnaryOperator
{
	public static void main(String[]args)
	{
		int i=1;//7
		int c=i++ + ++i + i++ + i++ + ++i + i++;//1+3+3+5+5+6=23
		System.out.println(c);
	}
}