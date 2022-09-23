import java.util.Scanner;

public class sortWords {
    public static void main(String[] args) {
        System.out.print("Type in a word: ");
        String a = new Scanner(System.in).nextLine();
        System.out.print("Type in another word: ");
        String b = new Scanner(System.in).nextLine();
        System.out.println(a.compareToIgnoreCase(b)==0?"The words are the same!":a.compareToIgnoreCase(b)<0?a + " goes before the word " + b: b + " goes before the word " + a);
    }
}
