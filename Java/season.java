import java.util.*;

public class season {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int b = a.nextInt();
        System.out.print("Enter a day: ");
        int c = a.nextInt();
        System.out.println(!(b>0&&b<13)?"Enter a valid month between 1 and 12.":!(c>0&&c<32)?"Enter a valid day between 1 and 31":Arrays.stream(new int[]{12, 1, 2, 3}).anyMatch(i -> i==b)&&((b==12&&c<32&&c>15)||(b==3&&c<16&&c>0))?"Winter":Arrays.stream(new int[]{3, 4, 5, 6}).anyMatch(i -> i==b)&&((b==3&&c<32&&c>15)||(b==6&&c<16&&c>0))?"Spring":Arrays.stream(new int[]{6, 7, 8, 9}).anyMatch(i -> i==b)&&((b==6&&c<32&&c>15)||(b==9&&c<16&&c>0))?"Summer":"Fall");
    }
}
