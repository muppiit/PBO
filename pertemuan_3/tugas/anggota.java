package PBO.pertemuan_3.tugas;

public class anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    private int angsur;

    public anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if (jumlahPinjaman > this.limitPinjaman) {
            System.out.println("Maaf, Jumlah peminjaman melebihi limit");
        } else {
            this.jumlahPinjaman = jumlahPinjaman;
        }
    }

    public void angsur(int angsur) {
        int minimAngsur = (10 * this.jumlahPinjaman) / 100;
        if (angsur < minimAngsur) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman saait ini");
        } else {
            this.jumlahPinjaman = this.jumlahPinjaman - angsur;
        }
        this.jumlahPinjaman = this.jumlahPinjaman - angsur;
    }
}
