import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n=sc.nextInt();
        int fact=1;
        if(n<1){
            System.out.println(fact);
          
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
   } 
}
