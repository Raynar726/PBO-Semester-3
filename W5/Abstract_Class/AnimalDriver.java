package W5.Abstract_Class;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog("Anjing", "Germany", 4);
        Animal chicken = new Chicken("Ayam", "Farm", 2);
        Animal lion = new Lion("Singa", "Africa", 4);

        Animal[] animals = {dog, chicken, lion};

        for (Animal a : animals) {
            System.out.println("Nama: " + a.getNama());
            System.out.println("Asal: " + a.getAsal());
            System.out.println("Jumlah Kaki: " + a.getJumlahKaki());
            System.out.print("Suara: ");
            a.toShout();
            a.toEat();
            System.out.println();
        }
    }
}