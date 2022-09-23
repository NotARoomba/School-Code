import java.util.Scanner;

public class subsection {
    public static void main(String[] args) {
        System.out.print("Type in a sentence: ");
        String a = new Scanner(System.in).nextLine();
        System.out.print("Type in a smaller number: ");
        int b  = new Scanner(System.in).nextInt();
        System.out.print("Type in a larger number: ");
        int c =  new Scanner(System.in).nextInt();
        System.out.println(b<0||c>a.length()?"Make sure your numbers arent smaller than 0 or greater than the number of letters in the sentence":"The letters are: " + a.substring(b, c));
    }
}
