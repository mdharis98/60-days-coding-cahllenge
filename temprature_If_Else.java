import java.util.*;

public class Temprature_If_Else{
	public static void main(String args[] ){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hiii, how are you");
		int temp=sc.nextInt();
		
		if(temp<100){
			System.out.println("you are fine ");
		}
		else {
			System.out.println("you are sick,you have fever");
		}
	}
}