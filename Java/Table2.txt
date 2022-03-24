import java.util.*;
public class Table2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Whats the string: ");
        String b = a.nextLine();
        System.out.println(String.format("%s\n%s\n%s", b.charAt(0), b.charAt(b.length() - 1), new StringBuilder(b).reverse().toString()));
    }
}
