package PBO.quiz_1;

public class main {
    public static void main(String[] args) {
        kategori k1 = new kategori("Multimedia");
        barang b1 = new barang("Kamera", "k001", 5, k1);

        System.out.println("Informasi Barang");
        b1.infoBarang();

        b1.pinjamBarang(3);

        System.out.println("Informasi Barang setelah dipinjam");
        b1.infoBarang();

        b1.kembalikanBarang(1);

        System.out.println("Informasi Barang setelah dikembalikan");
        b1.infoBarang();
    }
}
