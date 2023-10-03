import java.util.*;

public class Tableusing_Loop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number what do you want the table");
		int n=sc.nextInt();

		System.out.println("this is your table");
		for(int i=1;i<11;i++){
		System.out.println( n+"*"+i+"="+n*i);
		}
	}
}
		

		