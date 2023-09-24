package PBO.pertemuan_4.percobaan_2;

public class pelanggan {
    private String nama;
    private int hari;
    private mobil m;
    private sopir s;

    public void setNama(String setNama) {
        this.nama = setNama;
    }

    public String getNama() {
        return nama;
    }

    public void setHari(int setHari) {
        this.hari = setHari;
    }

    public int getHari() {
        return hari;
    }

    public void setMobil(mobil mobil) {
        this.m = mobil;
    }

    public mobil getMobil() {
        return m;
    }

    public void setSopir(sopir sopir) {
        this.s = sopir;
    }

    public sopir getSopir() {
        return s;
    }

    public int hitungBiayaTotal() {
        return m.hitungBiayaMobil(hari) + s.hitungBiayaSopir(hari);
    }
}
