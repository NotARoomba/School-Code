import java.util.Scanner;

class LeapYear {
    static int b;

    public static void main(String[] args) {
        if (i()) {
            System.out.println(String.format("%d is a leap year", b));
        } else {
            System.out.println(String.format("%d is NOT a leap year", b));
        }
    }

    public static boolean i() {
        System.out.print("Enter a year: ");
        Scanner r = new Scanner(System.in);
        return c(r, r.nextInt());
    }

    public static boolean c(Scanner f, int h) {
        return (b = ((int) ((h / ((int) 'd' + 'b') - ('c' * 99) + (65 * (int) 'A')) * -1)
                + ((h / ((int) (14.071 * 14.071) + 1) - (9801)
                        + (((int) (4225 / 32.5) / 2)) * (((int) 'a') - ((int) '@' / 2)))
                        * 1)
                + h)) % 4 == 0 && (b % 100 != 0 || b % 400 == 0) ? true : false;
    }
}