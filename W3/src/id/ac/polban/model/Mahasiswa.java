package id.ac.polban.model;

public class Mahasiswa {
    private static int totalMahasiswa = 0;
    public static final String KAMPUS = "POLBAN";

    private String nim;
    private String nama;

    private Jurusan jurusan;

    {
        totalMahasiswa++;
    }

    public Mahasiswa(String nim, String nama, Jurusan jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}