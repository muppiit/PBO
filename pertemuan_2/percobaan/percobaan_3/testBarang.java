package PBO.pertemuan_2.percobaan.percobaan_3;

public class testBarang {
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.namaBarang = "Pensil";
        b1.jenisBarang = "ATK";
        b1.stock = 10;
        b1.tampilBarang();
        System.out.println("Stock baru adalah : " + b1.tambahStock(20));
    }

}
