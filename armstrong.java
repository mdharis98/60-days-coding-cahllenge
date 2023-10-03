import java.util.*;

public class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int n,temp ,rem, result=0;	
		n=sc.nextInt();
		temp=n;	

		while(n>0){
		
			rem=n%10;
			result =(result) + (rem*rem*rem);
			n=n/10;
		}

		if(result==temp){
			System.out.println("yes  it is Armstrong no");
		}
		else{
			System.out.println("no it is not an Armstrong no");
		}
	}
}