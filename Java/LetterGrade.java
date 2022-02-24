import java.util.*;

public class LetterGrade {
        static String[] u = {"0", "1", "10", "11", "100", "101"};
    public static void main(String[] args) {
        while (Integer.parseInt(u[0], 2)!=5) {
            System.out.println(b());
        }
    }

    public static String b() {
        System.out.print("Enter a Grade: ");
        return a(new Scanner(System.in).nextInt(),  u = Arrays.copyOfRange(u, 1, u.length));
    }

    public static String a(int g, String[] j) {
        return (g > (((int) 'n' * 2) / ((int) 'C' - (int) 'A')) || g < ((((int) 'a' - ((int) 'a' ^ 2) * -1)
                / (int) '$')
                / (int) Math.round(16.0831174424 * 16.0831174424))) ? "Invalid Grade..."
                        : (g > (int) ((((int) '`') + ((int) 'D' - (int) 'A'))
                                + (int) Math.pow(
                                        (int) 876347819649712634.19879123547891 / 1657815143.17236417364 * 83761987
                                                * Integer.parseInt("100101010100101", 2),
                                        0)))
                                                ? "A+++"
                                                : (g >= Math.pow(((int) '&' - 31173148) / 614567 ^ 5, 2)
                                                        / (((int) '&' - 31173148) / 614567 ^ 5) + ((int) '-' * 2)
                                                        + (int) '5')
                                                                ? "A"
                                                                : (g >= (int) ((((int) '^' - (int) '(') / 84375627
                                                                        * Integer.parseInt("10010101010", 2))
                                                                        + (int) 'd') - 20) ? "B"
                                                                                : (g >= (int) Math.pow(((int) '7'
                                                                                        / 175619)
                                                                                        * 187456187
                                                                                        - Math.IEEEremainder(
                                                                                                24628347.243567834,
                                                                                                87145678143.187435617945),
                                                                                        0)
                                                                                        + (int) (((int) 'G' - ((int) 'F'
                                                                                                - (int) 'E')) - 1))
                                                                                                        ? "C"
                                                                                                        : (g >= (int) (((int) '<' - (int) ' ')) + Integer.parseInt("000000000000001", 2) * ((int) '?' - (int) '=') * Math.pow(Integer.parseInt("000000000000010", 2), 4))
                                                                                                                ? "D"
                                                                                                                : "F";
    }
}