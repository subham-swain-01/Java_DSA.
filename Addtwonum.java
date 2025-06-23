 import java.util.*;
 public class Addtwonum {
      public static void sumofnum(int a , int b){
         System.out.println(a+b);
     }
     public static int sumofnum(int a , int b){
         int sum= a+b;
         return sum;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter 1st num:");
         int a = sc.nextInt();
         System.out.println("enter 2nd num:");
         int b= sc.nextInt();
         // sumofnum(a,b);
         int sum=sumofnum(a, b);
         System.out.println(sum);
     }
 }


