import java.util.*;
public class DispalyAvgTotAndGradeOfSubject
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Java Marks:");
		int j= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter English marks:");
		int e= sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter Computer marks:");
		int c= sc.nextInt();
		System.out.println("---------------------");
		int tot=j+e+c;
		double avg=tot/3;
		if(avg>=75)
		{
			System.out.println("Grade A");
		}
		else if(avg<75 && avg>=60)
		{
			System.out.println("Grade B");
		}
		else if(avg<60 && avg>=40)
		{
			System.out.println("Grade C");
		}
		else if(avg<40 && avg>=35)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade Fail");
		}
	}
}



		