import java.util.*;

public class backwards {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        String a = new StringBuilder(new Scanner(System.in).nextLine()).reverse().toString();
        System.out.println(String.format("%c\n%c\n%s", a.charAt(a.length()-1), a.charAt(0), a));
        //loop
        System.out.print("Enter a word: ");
        String k="",b = new Scanner(System.in).nextLine();
        for (int i = b.length()-1;i>=0;i--) k+=b.charAt(i);
        System.out.println(k.charAt(k.length()-1) + "\n" + k.charAt(0) + "\n" + k);

    }
}
