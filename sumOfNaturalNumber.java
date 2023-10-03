import java.util.*;

public class SumOfNaturalNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.println("the sum of natural number is:");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		sum=sum+i;
		
		}
		System.out.println("sum:" +sum);
		
	}
}