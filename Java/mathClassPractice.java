import java.util.*;
public class mathClassPractice {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char b;
        do {
            System.out.println("PART 1\n-------------------");
            g c = () -> { int[] k = new int[3];int l = Integer.MIN_VALUE;for (int j= 0; j<k.length;j++) {System.out.print("Enter a number: ");k[j] = Math.abs(Integer.parseInt(a.nextLine()));};for (int j:k) {l=j>=l?j:l;};return l;};
            System.out.println("The highest absolute value is " +  c.gg());
            System.out.println("PART 2\n-------------------");
            h d = () -> { int[] h = new int[4];for (int j= 0; j<h.length;j++) {System.out.print("Enter a number: ");h[j] = Math.abs(Integer.parseInt(a.nextLine()));};return h;};
            int[] l = d.hh();
            System.out.println("The distance is " +  Math.sqrt((double) Math.pow((l[2] - l[0]), 2) + Math.pow((l[3] - l[1]), 2)));
            System.out.print("Do you want to try it again? ");
            b = a.nextLine().charAt(0);
        } while (b!='n');
    }
    public interface g{int gg();}
    public interface h{int[] hh();}
}