import java.util.Scanner;

public class Box {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();
        int i = 0;
        while (i < str.length()) {
            System.out.println(str);
            i++;
        }
    }
}
