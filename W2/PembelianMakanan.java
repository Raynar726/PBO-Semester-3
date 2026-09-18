import java.util.Scanner;
public class PembelianMakanan {
    private String namaPembeli;
    private String namaMenu;
    private int harga;
    private int jumlahPorsi;

    // Method untuk namaPembeli
    public void setnamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }
    public String getnamaPembeli() {
        return this.namaPembeli;
    }

    // Method untuk namaMenu
    public void setnamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    public String getnamaMenu() {
        return this.namaMenu;
    }

    // Method untuk harga
    public void setharga(int harga) {
        this.harga = harga;
    }
    public int getharga() {
        return this.harga;
    }

    // Method untuk jumlahPorsi
    public void setjumlahPorsi(int jumlahPorsi) {
        this.jumlahPorsi = jumlahPorsi;
    }
    public int getjumlahPorsi() {
        return this.jumlahPorsi;
    }

    // Main
    public static void main(String[] args) {
        PembelianMakanan pesanan1 = new PembelianMakanan();
        Scanner input = new Scanner(System.in); 

        // Nama pembeli
        System.out.print("Nama Pembeli: ");
        String namaPembeli = input.nextLine();
        pesanan1.setnamaPembeli(namaPembeli);

        // Nama menu
        System.out.print("Nama Menu: ");
        String namaMenu = input.nextLine();
        pesanan1.setnamaMenu(namaMenu);

        // Harga
        System.out.print("Harga: ");
        int harga = input.nextInt();
        pesanan1.setharga(harga);

        // Jumlah porsi
        System.out.print("Jumlah Porsi: ");
        int jumlahPorsi = input.nextInt();
        pesanan1.setjumlahPorsi(jumlahPorsi);
        input.close();

        int totalBayar = pesanan1.getharga() * pesanan1.getjumlahPorsi();

        System.out.println("=== STRUK KANTIN  ===");
        System.out.println("Nama Pembeli : " + pesanan1.getnamaPembeli());
        System.out.println("Menu Pesanan : " + pesanan1.getnamaMenu());
        System.out.println("Harga Satuan : Rp " + pesanan1.getharga());
        System.out.println("Jumlah Porsi : " + pesanan1.getjumlahPorsi());
        System.out.println("------------------------------------");
        System.out.println("Total Bayar  : Rp " + totalBayar);
        System.out.println("====================================");
    }
}