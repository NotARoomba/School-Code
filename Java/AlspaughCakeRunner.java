public class AlspaughCakeRunner {
    public static void main(String[] args) {
        AlspaughCake cake1 = new AlspaughCake("Wedding", "Vanilla", false, 10, 1200.50);
        AlspaughCake cake2 = new AlspaughCake("Birthday", "Chocolate", false, 4, 450.50);
        AlspaughCake cake3 = new AlspaughCake("Anniversary", "Strawberry", true, 7, 545.35);
        cake1.setNumLayers(cake1.numLayers++);
        cake2.setNumLayers(cake1.numLayers++);
        cake3.setNumLayers(cake1.numLayers++);
        cake1.setPrice(cake1.price += cake1.price * .1);
        cake2.setPrice(cake2.price += cake2.price * .1);
        cake3.setPrice(cake3.price += cake3.price * .1);
        cake1.setPrice(cake1.cakeName.charAt(0) == 'W' ? cake1.price += cake1.price / .25
                : cake1.cakeName.charAt(0) == 'B' ? cake1.price += cake1.price / .2
                        : cake1.cakeName.charAt(0) == 'A' ? cake1.price += cake1.price / .15
                                : cake1.price + cake1.price / .1);
        cake2.setPrice(cake2.cakeName.charAt(0) == 'W' ? cake2.price += cake2.price / .25
                : cake2.cakeName.charAt(0) == 'B' ? cake2.price += cake2.price / .2
                        : cake2.cakeName.charAt(0) == 'A' ? cake2.price += cake2.price / .15
                                : cake2.price + cake2.price / .1);
        cake3.setPrice(cake3.cakeName.charAt(0) == 'W' ? cake3.price += cake3.price / .25
                : cake3.cakeName.charAt(0) == 'B' ? cake3.price += cake3.price / .2
                        : cake3.cakeName.charAt(0) == 'A' ? cake3.price += cake3.price / .15
                                : cake3.price + cake3.price / .1);

        System.out.println(String.format(
                "=====Cake 1=====\nName: %s\nFlavor: %s\nLayers: %d\nPrice: %.2f\n=====Cake 2=====\nName: %s\nFlavor: %s\nLayers: %d\nPrice: %.2f\n=====Cake 3=====\nName: %s\nFlavor: %s\nLayers: %d\nPrice: %.2f",
                cake1.getCakeName(), cake1.getFlavor(), cake1.getNumLayers(), cake1.getPrice(), cake2.getCakeName(),
                cake2.getFlavor(),
                cake2.getNumLayers(), cake2.getPrice(), cake3.getCakeName(), cake3.getFlavor(), cake3.getNumLayers(),
                cake3.getPrice()));
    }
}
