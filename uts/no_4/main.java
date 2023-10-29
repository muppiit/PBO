package PBO.uts.no_4;

import coba.p.Mahasiswa;

public class main {
    public static void main(String[] args) {
        // b. Buat objek mahasiswa dan isi atribut melalui constructor
        mahasiswa mahasiswa1 = new mahasiswa("12345", "budi", "Jalan A", 'L');

        // Contoh cetak atribut objek mahasiswa1
        System.out.println("NIM: " + mahasiswa1.nim);
        System.out.println("Nama: " + mahasiswa1.nama);
        System.out.println("Alamat: " + mahasiswa1.alamat);
        System.out.println("Jenis Kelamin: " + mahasiswa1.jenisKelamin);
    }
}
