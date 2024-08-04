public class PrimeNumber{
	public static void main(String[]args){
	int num=3;
	int rem=0;
	for(int i=2; i<num;i++){
	if(num%i==0){
	rem =1;
	}
}
if(rem==0)
{
System.out.println("Prime");
}
else{
System.out.println("Not Prime");
}
}
}