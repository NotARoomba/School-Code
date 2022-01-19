public class Cake {

    boolean isTasty;

    int numCakeLayers;
    double price;

    String flavor;

    public Cake(boolean taste, int layers, double cost, String flavor1) {
        isTasty = taste;
        numCakeLayers = layers;
        price = cost;
        flavor = flavor1;
    }

    public Cake() {
        isTasty = true;
        numCakeLayers = 2;
        flavor = "Strawberry";
        price = 5.99;
    }

    public String getFlavor() {
        return flavor;
    }
    /*
     * public int getNumCakeLayers() {
     * return numCakeLayers;
     * }
     * public double getPrice() {
     * return price;
     * }
     * public boolean getIsTasty() {
     * return isTasty;
     * }
     */
}
