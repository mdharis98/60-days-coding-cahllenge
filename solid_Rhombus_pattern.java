import java.util.*;
public class Main {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++){
            System.out.print(" ");
            for ( int j = 1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}