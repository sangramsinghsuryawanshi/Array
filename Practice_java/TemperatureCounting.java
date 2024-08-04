import java.util.*;
public class TemperatureCounting
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempreture");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Freezing weather");
		}
		else if(n>=0 && n<=10)
		{
			System.out.println("Very Cold weather");
		}
		else if(n>10 && n<=20)
		{
			System.out.println(" Cold weather");
		}
		else if(n>20 && n<=30)
		{
			System.out.println("Normal in Temp");
		}
		else if(n>30 && n<=40)
		{
			System.out.println("It's hot");
		}
		else if(n>40)
		{
			System.out.println("It'very hot");
		}

		else
		{
			System.out.println("enter valid input");
		}	
	}
}

