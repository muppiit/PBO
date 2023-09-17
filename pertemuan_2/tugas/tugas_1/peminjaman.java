package PBO.pertemuan_2.tugas.tugas_1;

public class peminjaman {
    int id, harga, lamaSewa;
    String namaMember, namaGame;

    public peminjaman(int id, String nama, String game, int harga, int lama) {
        this.id = id;
        this.namaMember = nama;
        this.namaGame = game;
        this.harga = harga;
        this.lamaSewa = lama;
    }

    int totalHarga(int lamaSewa) {
        int totalHarga = lamaSewa * harga;
        return totalHarga;
    }

    void tampilData() {
        System.out.println("\n----------------------------------------");
        System.out.println("STRUK PEMINJAMAN");
        System.out.println("----------------------------------------");
        System.out.println("Id\t\t: " + id);
        System.out.println("Nama member\t: " + namaMember);
        System.out.println("Nama game\t: " + namaGame);
        System.out.println("Harga\t\t: Rp." + harga);
        System.out.println("Lama pinjam\t: " + lamaSewa + " hari");
        System.out.println("Total harga\t: " + totalHarga(lamaSewa));
        System.out.println("\n----------------------------------------");
    }
}
