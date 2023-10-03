import java.util.*;

public class Binary_Number{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first binary number");
		String a=sc.next();
		System.out.println("enter second binary number");
		String b=sc.next();

		int b1=Integer.parseInt(a);
		int b2=Integer.parseInt(b);
		int b3=b1+b2;
		System.out.println("Addition of two binary number" +Integer.toBinaryString(b3));
	}
}