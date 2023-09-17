package PBO.pertemuan_2.percobaan.percobaan_3;

public class barang {
    public String namaBarang, jenisBarang;
    public int stock;

    public void tampilBarang() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jenis Barang : " + jenisBarang);
        System.out.println("Stock : " + stock);
    }

    public int tambahStock(int barangMasuk) {
        int stockBaru = barangMasuk + stock;
        return stockBaru;
    }
}
