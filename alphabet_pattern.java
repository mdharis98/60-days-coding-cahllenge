import java.util.*;

public class Alphabet_pattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char Alphabet='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" "+Alphabet+" ");
				Alphabet++;
			}
			System.out.println();
		}
	}
}	
			