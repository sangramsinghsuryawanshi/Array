/*Q1
    1*2*3*4
    9*10*11*12
    13*14*15*16
    5*6*7*8

 Q2
    1*2*3*4
    9*10*11*12
    17*18*19*20
    13*14*15*16
    5*6*7*8

Q3
    4*3*2*1
    12*11*10*9
    8*7*6*5
    16*15*14*13*/
import java.util.*;
public class MixPatternEightTestYsingWhileDoWhileAndForLoop
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number for loop: ");
		int n = sc.nextInt();
		System.out.println("\n_________________________");
		int c=1,n1=4;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				System.out.print((c++));
				if(j<4)
				System.out.print("*");
			}
		c=c+n1;
		System.out.println();
		}
		c=13;
		for(int i=1;i<=2;i++)
		{
			for(int j=4;j>=i;j--)
			{
				
				System.out.print((c++));
				if(j<4)
				System.out.print("*");
			}
		c=c-12;
		System.out.println();
		}

	}
}