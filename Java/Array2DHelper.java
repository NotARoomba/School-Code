import java.util.Arrays;

public class Array2DHelper {
    public static int countEvens(int[][] mat) {
        int e = 0;
        for (int[] i : mat) {
            for (int f : i) {
                e+=f%2==0?1:0;
            }
        }
        return e;
    }
    public static void addOneToAllEvens(int[][] mat) {
        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j < mat[i].length; i++) {
                mat[i][j]+=mat[i][j]%2==0?1:0;
            }
        }
    }
    public static boolean fourOdds(int[][] mat) {
        int o = 0;
        for (int[] i : mat) {
            for (int j:i) {
                o+=j%2;
            }
        }
        return o==4;
    }
    public static int findSmallest(int[][] mat) {
        int s = Integer.MAX_VALUE;
        for (int[] i : mat) {
            for (int j:i) {
                s = Math.min(j, s);
            }
        }
        return s;
    }
    public static int findSmallestOdd(int[][] mat) {
        int s = Integer.MAX_VALUE;
        for (int[] i : mat) {
            for (int j:i) {
                s = j%2==1?Math.min(j, s):s;
            }
        }
        return s;
    }
    public static int findLargest(int[][] mat) {
        int s = Integer.MIN_VALUE;
        for (int[] i : mat) {
            for (int j:i) {
                s = Math.max(j, s);
            }
        }
        return s;
    }
    public static int findLargestEven(int[][] mat) {
        int s = Integer.MIN_VALUE;
        for (int[] i : mat) {
            for (int j:i) {
                s = j%2==0?Math.max(j, s):s;
            }
        }
        return s;
    }
    public static boolean has10Before5(int[][] mat) {
        int a = 0;
        int b = 0;
        for (int[] i : mat) {
            for (int f : i) {
                a = a==0&&(f==10||f==5)?f:a==10&&f==5?105:a;
                b = b==0&&(f==10||f==5)?f:b==10&&f==5?105:b;
            }
            a = a==105?a:0;
        }
        return (a==105||b==105);
    }



}
