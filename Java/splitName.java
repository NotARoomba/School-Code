import java.util.Scanner;

public class splitName {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String[] a = new Scanner(System.in).nextLine().split(" ");
        System.out.println(a.length==2?a[1] + ", " + a[0].charAt(0):a[0] + ", " + a[1]);
    }
}
