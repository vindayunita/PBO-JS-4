package Perpustakaan;

public class DetailPeminjaman {
      public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2441", "Vinda", "TI");

        Buku b1 = new Buku("B001", "Pemrograman Java", "Andi");
        Buku b2 = new Buku("B002", "Struktur Data", "Budi");

        Peminjaman p = new Peminjaman(mhs, "15-09-2025");
        p.tambahBuku(b1);
        p.tambahBuku(b2);

        p.tampilkanPeminjaman();
    }
}