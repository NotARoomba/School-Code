public class NathanAlspaugh {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Dog fido = new Dog();
        fido.Speak();
    }
}
class Dog {
    int numOfLegs;
    String eyeColor;
    public Dog() {
        eyeColor = "Green";
    }
    public void Speak() {
        System.out.println("Bark Bark!");
    }
}
