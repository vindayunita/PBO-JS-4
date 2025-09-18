package Perpustakaan;

public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;

    public Buku(String kodeBuku, String judul, String pengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kodeBuku + ", Judul: " + judul + ", Pengarang: " + pengarang);
    }
}