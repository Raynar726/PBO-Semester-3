package id.ac.polban.service;
import id.ac.polban.model.*;

public class Main {
    public static void main(String[] args) {
        Jurusan jrsTI = new Jurusan("Teknik Komputer dan Informatika");
        
        Mahasiswa mhs1 = new Mahasiswa("251511053", "Rasya", jrsTI);
        Mahasiswa mhs2 = new Mahasiswa("251511067", "Ikram", jrsTI);

        LaporanAkademik laporan = new LaporanAkademik();
        laporan.cetakKTM(mhs1);
        laporan.cetakKTM(mhs2);

        System.out.println("Total Mahasiswa yang terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}