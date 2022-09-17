import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.print("How many rounds do you want to play: ");
        for (int d = new Scanner(System.in).nextInt(); d > 0; d--) {
            int b,a = (int) Math.floor(1+(Math.random() * 3));
            do {
                System.out.print("What do you choose?\n[1] Rock\n[2] Paper\n[3] Scissors\nChoose a number: ");
                b = new Scanner(System.in).nextInt();
            } while(b>3||b<1);
            System.out.println("Computer choose: " + (a==1?"Rock":a==2?"Paper":"Scissors") + "\nYou choose: " + (b==1?"Rock":b==2?"Paper":"Scissors") + "\n" + (a==b?"Tie!":(a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1)?"You Win!":"Computer Won...") + "\n");
        }
    }
}
