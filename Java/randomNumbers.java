public class randomNumbers {
    public static void main(String[] args) {
        int a;
        do {
            System.out.print("Random Number: ");
            a = (int) (Math.random() * (1000));
            System.out.println(a);
        } while (a < 900);
    }
    
}
