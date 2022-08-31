import java.util.*;


public class DaysInMonth {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int b = a.nextInt();
        System.out.print("Enter a year: ");
        int c = a.nextInt();
        boolean g = c%4==0&&(c%100!=0||c%400==0)?true:false;
        System.out.println(String.format("Days in month: %d\nLeap Year: %s", b<8?b%2==1?31:b==2?g?29:28:30:b%2==1?30:31, g));

    }
}