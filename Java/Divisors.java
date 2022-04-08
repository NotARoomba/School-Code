import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = r.nextInt();
        printDivisors(f);
        System.out.println();
        //printDivisorsForLoop(45);
    }
    public static void printDivisors(int number) {
        int divisor = 1;
        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
    public static void printDivisorsForLoop(int number) {
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}
