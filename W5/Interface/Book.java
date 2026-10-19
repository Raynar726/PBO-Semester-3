package W5.Interface;

public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public void display() {
        System.out.println("--- Book Information ---");
        super.display();
        System.out.println("Author: " + author);
        System.out.println("Tax: " + calculateTax());
    }
}