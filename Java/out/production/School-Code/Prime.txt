import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Whats the number: ");
        int number = a.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("The number is not prime.");
                return;
            }
            System.out.println("The number is prime.");
            return;
        }
    }
}
