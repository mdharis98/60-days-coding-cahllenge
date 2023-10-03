import java.util.*;

public class Alphabet_inverse_half_pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char alphabet='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+alphabet+" ");
				alphabet++;
			}
			System.out.println();

		}
	}
}
		