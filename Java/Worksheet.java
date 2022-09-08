public class Worksheet {
    public static void main(String[] args) {
        // 1
        System.out.println("1------");
        for (int i=-2; i<19;i=i+3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("2------");
        for (int j=19; j>-2;j=j-2) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("3------");
        for (int x=25; x<50; x=x+3) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("4------");
        for (int m=37; m>0; m=m-4) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("5------");
        int t = 0;
        for (int s=1; s<7; s++) {
            t=t+s;
        }
        System.out.println(t);
        System.out.println("6------");
        int x = 100;
        while (x > 0) {
            System.out.println(x / 10);
            x = x/2;
        }
        System.out.println(x);
        // number 8 for loop
        System.out.println("8 for loop------");
        int n = 1;
        int max = 5;
        while (n <= max) {
            System.out.println(n);
            n++;
        }
        //number 9 for loop
        System.out.println("9 for loop------");
        int total = 25;
        int number = 1;
        while (number <= (total / 2)) {
            total = total - number;
            System.out.println(total + " " + number);
            number++;
        }
        //mystery function
        System.out.println("mystery------");
        mystery(1);
        mystery(6);
        mystery(19);
        mystery(39);
        mystery(74);

    }
    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y*2;
            z++;
        }
        System.out.println(y + " " + z);
    }
}
