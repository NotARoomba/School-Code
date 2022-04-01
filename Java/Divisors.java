public class Divisors {
    public static void main(String[] args) {
        printDivisors(45);
        System.out.println();
        printDivisorsForLoop(45);
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
