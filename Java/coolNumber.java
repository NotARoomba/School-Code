import java.util.*;

public class coolNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number between 10-100000: ");
        for (int a : new Integer[]{ new Scanner(System.in).nextInt()}) {
            int c=0,b=6;
            do  {
                if ((b%3==1&&b%4==1&&b%5==1&&b%6==1))  c+=1;
                b++;
            } while (!(b==a||a<10||a>100000));
            System.out.println(b==0?"Type in a number between 10-100000...":String.format("They typed in %d\n%d cool numbers between 6 - %d", a, c, a));
        }
    }
}
