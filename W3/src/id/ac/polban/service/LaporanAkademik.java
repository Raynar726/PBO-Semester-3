package id.ac.polban.service;
import id.ac.polban.model.Mahasiswa;

public class LaporanAkademik {
    public void cetakKTM(Mahasiswa mhs) {
        System.out.println("=== Kartu Tanda Mahasiswa ===");
        System.out.println("Kampus:   " + Mahasiswa.KAMPUS);
        System.out.println("NIM:   " + mhs.getNim());
        System.out.println("Nama:   " + mhs.getNama());
        System.out.println("Jurusan:   " + mhs.getJurusan().getNamaJurusan());
    }
}