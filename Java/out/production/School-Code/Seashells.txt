import java.util.*;

public class Seashells {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char b;
        do {
            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again? ");
            b = a.nextLine().charAt(0);
        } while (b!='n');
    }
    
}
