
import java.util.*;
 class Counter {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a number: ");
        char[] f = r.nextLine().toCharArray();
        int a = 0;
        while (f.length != 0) {
            f = Arrays.copyOf(f, f.length-1);
            a++;
        }
        System.out.println("The number has " + a + " characters.");
    }
}