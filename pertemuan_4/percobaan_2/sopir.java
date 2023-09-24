package PBO.pertemuan_4.percobaan_2;

public class sopir extends mobil {
    private String nama;

    sopir() {
    }

    public void setNama(String setNama) {
        this.nama = setNama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int setBiaya) {
        this.biaya = setBiaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
