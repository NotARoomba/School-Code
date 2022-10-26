import java.util.*;

public class ArrayListHelper {
    public static ArrayList<Integer> arrayToList(int[] numbs) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int b : numbs) {
            a.add(b);
        }
        return a;
    }
    public static ArrayList<Double> arrayToList(double[] numbs) {
        ArrayList<Double> a = new ArrayList<>();
        for (double b : numbs) {
            a.add(b);
        }
        return a;
    }
    public static ArrayList<String> arrayToList(String[] numbs) {
        ArrayList<String> a = new ArrayList<>();
        for (String b : numbs) {
            a.add(b);
        }
        return a;
    }
    public static int count(ArrayList<Integer> numbs, int target) {
        int t = 0;
        for (int b : numbs) {
            t+=b==target?1:0;
        }
        return t;
    }
    public static int count(ArrayList<String> numbs, String target) {
        int t = 0;
        for (String b : numbs) {
            t+=Objects.equals(b, target)?1:0;
        }
        return t;
    }


}
