public class Main {
    public static void main(String[] args) {
        Park aukstaitijaPark = new Park("Aukštaitija National Park", 55.3833, 25.9333);
        Park dzukijaPark = new Park("Dzūkija National Park", 54.1000, 24.2000);
        Park trakaiPark = new Park("Trakai National Park", 54.6500, 24.9333);
        Park zemaitijaPark = new Park("Žemaitija National Park", 56.0500, 21.8333);

        River nemunasRiver = new River("Nemunas River", new String[]{
                "54.9000, 23.9000",
                "55.3000, 21.1000"
        });

        River nerisRiver = new River("Neris River", new String[]{
                "54.6833, 25.2833",
                "54.9000, 23.9000"
        });

        River ventaRiver = new River("Venta River", new String[]{
                "56.3833, 22.3833",
                "56.0167, 21.1333"
        });

        Layer<Park> parkLayer = new Layer<>();
        parkLayer.addElement(aukstaitijaPark);
        parkLayer.addElement(dzukijaPark);
        parkLayer.addElement(trakaiPark);
        parkLayer.addElement(zemaitijaPark);

        Layer<River> riverLayer = new Layer<>();
        riverLayer.addElement(nemunasRiver);
        riverLayer.addElement(nerisRiver);
        riverLayer.addElement(ventaRiver);

        System.out.println("Rendering Park:");
        parkLayer.renderLayer();

        System.out.println("Rendering River:");
        riverLayer.renderLayer();
    }
}