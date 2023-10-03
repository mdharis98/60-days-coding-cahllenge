
import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int t;
        for (int i=1;i<=10;i++){
             t =n*i;
             System.out.println(n+"*"+i+"="+t);
        }
    }
}