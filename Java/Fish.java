public class Fish {
    boolean isReal;
    String name;

    public Fish(String name1, boolean real) {
        isReal = real;
        name = name1;
    }

    public String getName() {
        return name;
    }

    public String realOrNotReal() {
        return isReal ? "Exists" : "Does not exist";
    }
}
