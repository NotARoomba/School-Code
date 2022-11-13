import java.util.ArrayList;
import java.util.Arrays;

public class Array2DPractice {
    public static void main(String[] args) {
        int[][] n = new int[4][6];
        n[2][4] = 5;
        n[1][3] = 5;
        n[0][5] = 5;
        n[3][2] = 5;
        for (int[] i : n) {
            for (int f : i) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
        String[][] s = new String[5][10];
        for (int i = 0; i< s.length; i++) {
            Arrays.fill(s[i], "Bears");
        }
        for (String[] i : s) {
            for (String f : i) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}
