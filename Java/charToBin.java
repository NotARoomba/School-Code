import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class charToBin {
    public static void main(String[] args) {
        String paste = "\"\" +";
        Scanner r = new Scanner(System.in);
        String f = r.nextLine();
        String[] a = f.split(" ");
        int[] b = {};

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (a[i].matches(".*\\d.*")) {
                b = addX(b, Integer.parseInt(a[i].replaceAll("\\D+", "")));
            }
        }
        for (int i = 0; i < b.length; i++) {
            String h = Integer.toBinaryString((int) b[i]);
            paste += " ((char) Integer.parseInt((new String() +";
            for (int c = 0; c < h.length(); c++) {
                paste += " ((char) " + (int) h.charAt(c) +") +";
            }
            paste = paste.substring(0, paste.length() - 1);
            paste += "), 2)) +";
        }
        System.out.println((paste.substring(0, paste.length() - 1))
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 110\\)", "((char) 10)")
                .replaceAll("\\(\\(char\\) 92\\) \\+ \\(\\(char\\) 92\\)", "((char) 92)"));
    }

    public static int[] addX(int arr[], int x) {
        int i;
        int newarr[] = new int[arr.length + 1];
        for (i = 0; i < arr.length; i++)
            newarr[i] = arr[i];

        newarr[arr.length] = x;

        return newarr;
    }
}
