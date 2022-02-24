import java.util.Scanner;

class LeapYear2 {
    public static void main(String[] args) {
        int year = input();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static int input() {
        System.out.print("Enter a year: ");
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}