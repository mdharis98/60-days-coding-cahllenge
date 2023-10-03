import java.util.*;
public class QuotientReminder{
	public static void main(String args[]){
		int my_devided,my_devisor,my_quotient,my_reminder;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter devided number");
		my_devided=sc.nextInt();

		System.out.println("enter devisor number");
		my_devisor=sc.nextInt();

		my_quotient=my_devided / my_devisor;
		my_reminder=my_devided % my_devisor;

		System.out.println("the quotientis:"+my_quotient);
		System.out.println("the reminder is:"+my_reminder);
	}
}