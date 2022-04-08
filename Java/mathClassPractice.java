import java.util.*;
public class mathClassPractice {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] c = new int[3];
        int[] d = new int[4];
        char b;
        do {
            System.out.println("PART 1\n-------------------");
            for (int f= 0; f<c.length;f++) {
                System.out.print("Enter a number: ");
                c[f] = Math.abs(Integer.parseInt(a.nextLine()));
            }
            System.out.println("The highest absolute value is " +  g(c));
            System.out.println("PART 2\n-------------------");
            for (int f= 0; f<d.length;f++) {
                System.out.print("Enter a number: ");
                d[f] = Integer.parseInt(a.nextLine());
            }
            System.out.println("The distance is " +  Math.sqrt((double) Math.pow((d[2] - d[0]), 2) + Math.pow((d[3] - d[1]), 2)));
            System.out.print("Do you want to try it again? ");
            b = a.nextLine().charAt(0);
        } while (b!='n');
    }
    public static int g(int[] c) {
        gg k = () -> { int l = Integer.MIN_VALUE;for (int j:c) {l=j>=l?j:l;};return l;};
        return k.ggg();
    }
    interface gg{  
        public int ggg();  
    }
}