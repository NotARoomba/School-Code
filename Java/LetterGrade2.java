import java.util.Scanner;

public class LetterGrade2 {
    public static void main(String[] args) {
        int i = 0;
        while (i != 5) {
            System.out.println(getGrade());
            i++;
        }
    }

    public static String getGrade() {
        System.out.print("Enter a Grade: ");
        Scanner reader = new Scanner(System.in);
        return getLetter(reader.nextInt());
    }

    public static String getLetter(int grade) {
        if (grade > 110 || grade < 0) {
            return "Invalid Grade...";
        } else if (grade > 100) {
            return "A+++";
        } else if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}