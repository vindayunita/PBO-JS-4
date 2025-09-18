package Perpustakaan;

import java.util.ArrayList;

public class Peminjaman {
    private Mahasiswa mahasiswa;
    private ArrayList<Buku> daftarBuku;
    private String tanggalPinjam;

    public Peminjaman(Mahasiswa mahasiswa, String tanggalPinjam) {
        this.mahasiswa = mahasiswa;
        this.tanggalPinjam = tanggalPinjam;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanPeminjaman() {
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        mahasiswa.tampilkanInfo();
        System.out.println("Daftar Buku Dipinjam:");
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }
}