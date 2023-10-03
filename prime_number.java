import java.util.*;

public class prime_number{
	public static void main(String args[]){
		int prime=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();

		for(int i=2;i<num;i++){
			if((num%i)==0){
				prime=0;
			}
		}
		if(prime==1){
			System.out.println(num+ "  is a prime number");
		}
		else{
			System.out.println(num+ "  is not prime number");
		}
	}
}
			
		