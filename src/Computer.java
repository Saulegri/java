public class Computer extends ProductForSale{
    public Computer(String type, double price, String description) {
        super(type,price,description);
    }

    @Override
    public void showDetails() {
        System.out.println(description);
        System.out.println("The price of this item is " + price + " euro");
        System.out.println(type);
    }
}
