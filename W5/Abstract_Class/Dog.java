package W5.Abstract_Class;

public class Dog extends Animal {
    public Dog(String nama, String asal, int jumlahKaki) {
        super(nama, asal, jumlahKaki);
    }

    @Override
    public void toShout() {
        System.out.println("Guk guk!");
    }
}