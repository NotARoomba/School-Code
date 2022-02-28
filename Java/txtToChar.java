import java.util.*;

public class txtToChar {
    public static void main(String[] args) {
        String paste = "\"\" +";
        Scanner r = new Scanner(System.in);
        String f = r.nextLine();
        for (int i = 0; i < f.length(); i++) {
            paste += " ((char) " + (int) f.charAt(i) + ") +";
        }
        System.out.println((paste.substring(0, paste.length() - 1)));
    }
}
