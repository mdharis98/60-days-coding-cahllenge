import java.util.*;
public class main {
public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();

    while(n>0){
        int x=n%10;
        System.out.print(x);
        n=n/10;
        }
    }
}