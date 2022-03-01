import java.util.*;

public class txtToChar {
    public static void main(String[] args) {
        String paste = "\"\" +";
        Scanner r = new Scanner(System.in);
        String f = r.nextLine();
        for (int i = 0; i < f.length(); i++) {
            paste += " ((char) Integer.parseInt(" + Integer.toBinaryString((int) f.charAt(i)) + "), 2) +";
        }
        System.out.println((paste.substring(0, paste.length() - 1))
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 110\\)", "((char) 10)")
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 92\\)", "((char) 92)"));
    }
}
