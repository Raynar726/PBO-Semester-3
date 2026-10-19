package W5.Interface;

public class GoodsDriver {
    public static void main(String[] args) {
        Food foodItem = new Food("Chocolate Bar", 1.5, 250);
        Toy toyItem = new Toy("Action Figure", 15.0, 5);
        Book bookItem = new Book("Java Programming", 29.99, "John Doe");

        foodItem.display();
        System.out.println();
        toyItem.display();
        System.out.println();
        bookItem.display();
    }
}