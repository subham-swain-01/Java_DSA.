import java.util.*;
public class EvnOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
