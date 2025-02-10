
public class Store {
    public static void main (String[] args){
        Computer computer = new Computer("Apple Macbook Pro", 4000, "Best quality in market");
        Mouse mouse = new Mouse ("Apple mouse", 100, "Best quality in market");

        OrderItem order1 = new OrderItem(1, computer);
        OrderItem order2 = new OrderItem(3, mouse);

       computer.showDetails();
        System.out.println("------------");
        mouse.showDetails();
        System.out.println("------------");

        System.out.println("Order 1");

        order1.printPricedItem();

        System.out.println("Order 2");

        order2.printPricedItem();
    }
}