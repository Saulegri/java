public class OrderItem {
    private int quantity;
    private ProductForSale product;

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double getSalesPrice() {
        return product.getPrice() * quantity;
    }

    public void printPricedItem() {
        product.printPricedItem(quantity);
    }

}