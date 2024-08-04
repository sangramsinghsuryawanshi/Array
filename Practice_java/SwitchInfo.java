import java.util.*;
public class SwitchInfo
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter-->Age count you want(Ex-10)");
		int n = sc.nextInt();
		System.out.println("Enter-->Name count you want(Ex-10)");
		int n1 = sc.nextInt();
		System.out.println("Enter-->education count you want(Ex-10)");
		int e1 = sc.nextInt();
		int i =1;
		int j =1;
		int k =1;
		int age=0;
		String name="";
		String education="";
		while(i<=n)
		{
		System.out.println("Enter-->Age");
		 age = sc.nextInt();
		i++;
		}
		System.out.println("------------------------------");
		while(j<=n1)
		{
		System.out.println("Enter-->Name");
		name = sc.nextLine();

		sc.next();
		j++;
		}
		System.out.println("------------------------------");
		while(k<=e1)
		{
		System.out.println("Enter-->education");
		education = sc.nextLine();
		k++;
		}
		System.out.println("------------------------------");
		System.out.println("Press:1-->age\t Press:2-->Name \t Press:3-->Education\t Press:4-->All information");
                int op=sc.nextInt();
		switch(op)
		{
			case 1:System.out.println(age);
			break;
                        case 2:System.out.println("\t\t"+name);
			break;
                        case 3:System.out.println(education);
			break;
			case 4:System.out.println("------------------------------");
			System.out.println(+age+ ", " +name+ " , "+education);
			break;
			default:System.out.println("Inavlid Number");
			break;
		}
			}
}