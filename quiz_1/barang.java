package PBO.quiz_1;

public class barang {
    private String nama;
    private String kodeBarang;
    private int stock;
    private kategori kategori;

    public barang(String nama, String kodeBarang, int stock, kategori kategori) {
        this.nama = nama;
        this.kodeBarang = kodeBarang;
        this.stock = stock;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public kategori getKategori() {
        return kategori;
    }

    public void pinjamBarang(int jumlahDipinjam) {
        if (jumlahDipinjam <= stock) {
            stock -= jumlahDipinjam;
            System.out.println("Barang berhasil dipinjam.");
            System.out.println("==================================");
        } else {
            System.out.println("Stok barang tidak mencukupi untuk dipinjam.");
            System.out.println("===========================================");

        }
    }

    public void kembalikanBarang(int jumlahDikembalikan) {
        stock += jumlahDikembalikan;
        System.out.println("Barang berhasil dikembalikan.");
        System.out.println("==================================");
    }

    public void infoBarang() {
        System.out.println("==================================");
        System.out.println("               Barang             ");
        System.out.println("==================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Stock       : " + stock);
        System.out.println("Kategori    : " + kategori.getNama());
        System.out.println("==================================");
    }

}
