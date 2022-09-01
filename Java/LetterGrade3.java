import java.util.Scanner;

public class LetterGrade3 {
    public static void main(String[] args) {
        System.out.print("Fun mode? (y/n): ");
        Scanner a = new Scanner(System.in);
        char z =  a.nextLine().charAt(0);
        System.out.println("Grade: ");
        int c = a.nextInt();
        System.out.println((c>110?"Cheater...":c<0?"Invalid grade...":c>100?"A+++":c>=90?"A":c>=80?"B":c>=70?"C":c>=60?"D":"F") + (!(z =='y')?"":" "+(c>110?":-/":c<0?":-O":c>100?":')":c>=90?":-D":c>=80?":-)":c>=70?":-(":c>=60?":'(":":-O")));
    }
}
