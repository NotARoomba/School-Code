import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Whats the number: ");
        int number = a.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println((i + " " + Integer.toString(number * i)));
        }
    }
}
