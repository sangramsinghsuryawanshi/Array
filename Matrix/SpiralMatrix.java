import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter given matrix 1: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int top=0,left=0;
		int right=a.length-1,bottom=a.length-1;
		while(top<=bottom && left<=right)
		{
			int i=left;
			while(i<=right){
				System.out.print(a[top][i]+" ");
			i++;
			}
			top++;
			i=top;
			while(i<=bottom){
				System.out.print(a[i][right]+" ");
			i++;
			}
			right--;
			if(top<=bottom){
			i=right;
			while(i>=left){
				System.out.print(a[bottom][i]+" ");
			i--;
			}
			bottom--;
			}
			if(left<=right){
			i=bottom;
			while(i>=top){
				System.out.print(a[i][left]+" ");
			i--;
			}
			left++;
			}
		}
	}
}