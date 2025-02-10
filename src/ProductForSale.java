public abstract class ProductForSale {
    public String type;
    public double price;
    public String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void printPricedItem(int quantity) {
        System.out.println(quantity + " items at " + price + " euro each" + "(type:" + type + ", description: " + description + ")");
    }

    public abstract void showDetails();

}