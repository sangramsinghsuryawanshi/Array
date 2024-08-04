import java.util.Scanner;
class DriverInssurdOrNot
{
	public static void main(String[] args)
	{
    		Scanner s=new Scanner(System.in);
    		System.out.println("driver is married or not (Y/F)");
     		char n1=s.next().charAt(0); 
     		System.out.println("driver is Male or Female (M/F)");
     		char n2=s.next().charAt(0); 
     		System.out.println("driver age:");
     		int age =s.nextInt();

      		if(n1=='Y')
		{
        		 System.out.println("driver inssured because married");
         	}
		else if(n2=='M')
		{
              		if(age>=30)
			{
             		System.out.println("Man driver inssured ");
                	}
			else
			{
              			System.out.println("Man driver not inssured ");
        	      	}

	        }	
		else if(n2=='F')
		{

               		if(age>=25)
			{
              			System.out.println("female driver inssured ");
                	}
			else
			{
             			 System.out.println("female driver not inssured ");
               }
          }
     }
}