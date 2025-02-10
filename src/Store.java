import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Apple Macbook Pro", 4000, "Best quality in market");
        Computer computer2 = new Computer("Dell XPS", 3000, "Powerful and lightweight");
        Mouse mouse1 = new Mouse("Apple mouse", 100, "Best quality in market");
        Mouse mouse2 = new Mouse("Logitech MX Master", 120, "Great for productivity");

        computer1.showDetails();
        System.out.println("------------");
        mouse1.showDetails();
        System.out.println("------------");
        computer2.showDetails();
        System.out.println("------------");
        mouse2.showDetails();
        System.out.println("------------");


        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem(1, computer1));
        orderItems.add(new OrderItem(1, mouse1));
        orderItems.add(new OrderItem(1, computer2));
        orderItems.add(new OrderItem(2, mouse2));
        orderItems.add(new OrderItem(1, computer1));

        System.out.println("Order 1: ");
        double orderTotal = 0;
        for (OrderItem item : orderItems) {
            item.printPricedItem();
            orderTotal += item.getSalesPrice();
        }

        System.out.println("Total price: " + orderTotal + " euro");
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(new OrderItem(2, computer1));
        orderItems1.add(new OrderItem(3, mouse1));

        System.out.println("Order 2: ");
        double orderTotal2 = 0;
        for (OrderItem item : orderItems1) {
            item.printPricedItem();
            orderTotal2 += item.getSalesPrice();
        }

        System.out.println("Total price: " + orderTotal2 + " euro");
    }
}