import java.util.*;


public class DaysInMonth {
    static int b;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int b = a.nextInt();
        boolean g = i();
        System.out.println(String.format("Days in month: %d\nLeap Year: %s", b<8?b%2==1?31:b==2?g?29:28:30:b%2==1?30:31, g));

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