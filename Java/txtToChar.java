import java.util.*;

public class txtToChar {
    public static void main(String[] args) {
        String paste = "\"\" +";
        Scanner r = new Scanner(System.in);
        String f = r.nextLine();
        for (int i = 0; i < f.length(); i++) {
            paste += " ((char) " + (int) f.charAt(i) + ") +";
        }
        System.out.println("" + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 44) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 44) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 92) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 47) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 92) + ((char) 48) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 48) + ((char) 47) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 124) + ((char) 92) + ((char) 47) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 92) + ((char) 47) + ((char) 124) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 124) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 124) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 47) + ((char) 32) + ((char) 92) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 32) + ((char) 47) + ((char) 32) + ((char) 92) + ((char) 10) + ((char) 32) + ((char) 32) + ((char) 32) +((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 47) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 92) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 47) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 92) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 95) + ((char) 10));
        System.out.println((paste.substring(0, paste.length() - 1)).replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 110\\)", "((char) 10)").replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 92\\)","((char) 92)"));
    }
}
