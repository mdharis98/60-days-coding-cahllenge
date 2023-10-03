import java.util.*;

public class Palindrome_Number{
	public static void main(String args[]){
		int i,temp,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			r = num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}
}