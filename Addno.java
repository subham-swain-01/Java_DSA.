import java.util.*;
public class Addno {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit=0;
    while(n!=0){
       int lastno= n%10;
       digit+=lastno;
      n=n/10;

    }
    System.out.println(digit);
   } 
}
