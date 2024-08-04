import java.util.*;
public class StudentPassOrFail
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marathi Marks");
		int n = sc.nextInt();
		System.out.println("Enter phy Marks");
		int n1 = sc.nextInt();
		System.out.println("Enter bio Marks");
		int n2 = sc.nextInt();
		System.out.println("Enter java Marks");
		int n3 = sc.nextInt();
		System.out.println("Enter cs Marks");
		int n4 = sc.nextInt();
		int tot=n+n1+n2+n3+n4;
		float per=tot/5;
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per<90 && per>80)
		{
			System.out.println("Grade B");
		}
		else if(per<80 && per>70)
		{
			System.out.println("Grade C");
		}
		if(per<70 && per>=60)
		{
			System.out.println("Grade D");
		}
		if(per<60 && per>=40)
		{
			System.out.println("Grade E");
		}
		if(per<40 && per>=35)
		{
			System.out.println("Grade F");
		}

		else
		{
			System.out.println("Fail");
		}
	System.out.println("Total marks:"+tot);
	System.out.println("Total percentage:"+per);
	
	}
}

