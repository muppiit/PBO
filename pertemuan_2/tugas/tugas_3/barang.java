package PBO.pertemuan_2.tugas.tugas_3;

public class barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    public barang(String kode, String namaBarang, int harga, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = harga;
        this.diskon = diskon;
    }

    int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
        return hargaJual;
    }

    void tampilData() {
        System.out.println("\n-----------------------------------");
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : Rp. " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga jual :" + hitungHargaJual());
        System.out.println("\n-----------------------------------");
    }
}
