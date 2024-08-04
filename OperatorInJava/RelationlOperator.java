import java.util.Scanner;
class RelationlOperator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		System.out.println("Relation Operator grater than a>b------>"+(a>b));		
		System.out.println("Relation Operator less than a<b------>"+(a<b));			
		System.out.println("Relation Operator grater than equal to a>=b------>"+(a>=b));		
		System.out.println("Relation Operator less than equal to a<=b------>"+(a<=b));			
		System.out.println("Relation Operator equal to equal a==b------>"+(a==b));		
		System.out.println("Relation Operator not equal to a!=  b------>"+(a!=b));			
	}
}