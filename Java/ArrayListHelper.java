import java.lang.reflect.Array;
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
    public static ArrayList<Integer> downOrder(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
    public static ArrayList<Integer> mathFib(int[] numbs) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < numbs.length-1;i++) {
            sums.add(numbs[i] + numbs[i+1]);
        }
        return sums;
    }
    public static int sum(int num) {
        int a = 0;
        while (num > 0) {
            a +=num % 10;
            num /=10;
        }
        return a;
    }
    public static ArrayList<Integer> total10(ArrayList<Integer> numbs) {
        ArrayList<Integer> n = new ArrayList<>();
        for (int i : numbs) {
            int a = 0;
            int f = i;
            while (f > 0) {
                a +=f % 10;
                f /=10;
            }
            if (a==10) n.add(i);
        }
        return n;
    }
    public static boolean isEven(int num) {
        return num / 2 == 0;
    };
    public static ArrayList<String> changeCase(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()%2==0) list.set(i, list.get(i).toUpperCase());
            else list.set(i, list.get(i).toLowerCase());
        }
        return list;
    }
    public static String dubLetterHelper(String word) {
        String f = "";
        for (char a : word.toCharArray()) {
            f += a + a;
        }
        return f.toString();
    }
    public static void dubletter(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            words.set(i, dubLetterHelper(words.get(i)));
        }
    }
    public static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString() == word;
    }
    public void allPalindromes(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (!isPalindrome(words.get(i))) {
                words.remove(i);
            }
        }
    }
}
