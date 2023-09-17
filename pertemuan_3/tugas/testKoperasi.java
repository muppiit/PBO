package PBO.pertemuan_3.tugas;

import java.util.Scanner;

public class testKoperasi {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                anggota donny = new anggota("111333444", "Donny", 5000000);
                System.out.println("Nama Anggota : " + donny.getNama());
                System.out.println("Limit peminjaman : " + donny.getLimitPinjaman());

                System.out.println("\nMeminjam uang Rp.10.000.000");
                donny.pinjam(10000000);
                System.out.println("Jumlah pinjaman saat ini : Rp." +
                                donny.getJumlahPinjaman());

                int pinjam;
                System.out.print("Masukkan pinjaman : ");
                pinjam = input.nextInt();
                donny.pinjam(pinjam);

                System.out.println("\nMeminjam uang : Rp." + pinjam);
                System.out.println("Jumlah pinjaman saat ini : Rp." +
                                donny.getJumlahPinjaman());

                System.out.println("\nMembayar angsuran 1.000.000...");
                donny.angsur(1000000);

                int angsur;
                System.out.print("Masukkan pinjaman : ");
                angsur = input.nextInt();
                donny.angsur(angsur);

                System.out.println("Jumlah pinjaman saat ini : Rp." +
                                donny.getJumlahPinjaman());
                System.out.println("\nMembayar angsuran : Rp." + angsur);
                System.out.println("Jumlah pinjaman saat ini : Rp." +
                                donny.getJumlahPinjaman());
                // anggota donny = new anggota("111333444", "Donny", 5000000);
                // System.out.println("Nama Anggota : " + donny.getNama());
                // System.out.println("Limit peminjaman : " + donny.getLimitPinjaman());

                // System.out.println("\nMeminjam uang 10.000.000...");
                // donny.pinjam(10000000);
                // System.out.println("Jumlah pinjaman saat ini : " +
                // donny.getJumlahPinjaman());

                // System.out.println("\nMeminjam uang 4.000.000...");
                // donny.pinjam(4000000);
                // System.out.println("Jumlah pinjaman saat ini : " +
                // donny.getJumlahPinjaman());

                // System.out.println("\nMembayar angsuran 1.000.000...");
                // donny.angsur(1000000);
                // System.out.println("Jumlah pinjaman saat ini : " +
                // donny.getJumlahPinjaman());

                // System.out.println("\nMembayar angsuran 3.000.000...");
                // donny.angsur(3000000);
                // System.out.println("Jumlah pinjaman saat ini : " +
                // donny.getJumlahPinjaman());
        }
}
