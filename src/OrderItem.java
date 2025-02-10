public class OrderItem {
    private int quantity;
    private ProductForSale product;

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }
    public void printPricedItem() {
        product.printPricedItem(quantity);
    }

}