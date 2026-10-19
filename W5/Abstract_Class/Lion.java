package W5.Abstract_Class;

public class Lion extends Animal {
    public Lion(String nama, String asal, int jumlahKaki) {
        super(nama, asal, jumlahKaki);
    }

    @Override
    public void toShout() {
        System.out.println("Rawrr!!");
    }
}