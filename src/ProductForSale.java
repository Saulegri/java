public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int quantity) {
        double totalPrice = price * quantity;
        System.out.println(quantity + " items at " + price  + " euro each" + "(type:"+ type + ", description: "+ description + ")");
        System.out.println("Total price: " + totalPrice );
    }

    public abstract void showDetails();

}