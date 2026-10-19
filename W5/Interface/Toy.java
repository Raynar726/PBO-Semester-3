package W5.Interface;

public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public void display() {
        System.out.println("--- Toy Information ---");
        super.display();
        System.out.println("Minimum Age: " + minimumAge + " years");
        System.out.println("Tax: " + calculateTax());
    }   
}