public class DataType
{
	static int a=10;
	static int b =10;
	public void main()
	{
		System.out.println("Instance datatype access in method:"+a);
	}
	public static void main(String[]args)
	{
		int c=25;
		System.out.println("Local variable:"+a);
		{
			
		System.out.println("static keyword access in Main method:"+b);
		DataType d1 = new DataType();
		d1.main();
		System.out.println("Addition of all datatype:"+(a+b+c));
		}

	}
}