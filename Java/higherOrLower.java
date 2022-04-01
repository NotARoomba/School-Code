import java.util.*;
public class higherOrLower {
    public static void main(String[] args) {
        int a;
        int n = (int) (Math.random() * (200 - 100)) + 100;
        do {
            System.out.println("Enter a number from 100 and 199");
            a = new Scanner(System.in).nextInt();
            System.out.println(a != n ? a > n ? "Lower" : "Higher" : "");
        } while (a != n);
        System.out.println("Yay you got it right!");
    }
    
}
