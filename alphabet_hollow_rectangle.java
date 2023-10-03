import java.util.*;

public class Alphabet_hollow_rectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char alphabet='a';

		for(int i=1; i<=n;i++){
			for(int j=1;j<=m;j++){
				if(i==1 || j==1 || i==n || j==m){
					System.out.print(" "+alphabet+" ");
					alphabet++;
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}