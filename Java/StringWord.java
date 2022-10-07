import java.util.Scanner;

public class StringWord {

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        System.out.println(WeirdUppercase(new Scanner(System.in).nextLine()));

    }
    public static int WeirdUppercase(String word) {
        int c = 0;
        for (String a : word.split("")) {
            if (Character.isUpperCase(a.charAt(0))) c++;
            if ("GWS".contains(a)) c++;
        }
        return c;
    }
}
