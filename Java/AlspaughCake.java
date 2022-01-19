public class AlspaughCake {
    String cakeName;
    String flavor;
    boolean glutenFree;
    int numLayers;
    double price;

    public AlspaughCake(String name, String taste, boolean gluten, int layers, double cost) {
        cakeName = name;
        flavor = taste;
        glutenFree = gluten;
        numLayers = layers;
        price = cost;
    }

    public String getCakeName() {
        return cakeName;
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean getGlutenFree() {
        return glutenFree;
    }

    public int getNumLayers() {
        return numLayers;
    }

    public double getPrice() {
        return price;
    }

    public void setNumLayers(int numlayers) {
        numLayers = numlayers;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
