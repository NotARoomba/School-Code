import java.util.*;

public class txtToChar {
    public static void main(String[] args) {
        String paste = "new String() +";
        Scanner r = new Scanner(System.in);
        String f = r.nextLine();
        for (int i = 0; i < f.length(); i++) {
            String h = Integer.toBinaryString((int) f.charAt(i));
            paste += " ((char) Integer.parseInt((new String() +";
            for (int b = 0; b < h.length(); b++) {
                paste += " ((char) " + (int) h.charAt(b) +") +";
            }
            paste = paste.substring(0, paste.length() - 1);
            paste += "), 2)) +";
        }
        System.out.println((paste.substring(0, paste.length() - 1))
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 110\\)", "((char) 10)")
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 92\\)", "((char) 92)"));
    }
}
