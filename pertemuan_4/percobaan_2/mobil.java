package PBO.pertemuan_4.percobaan_2;

public class mobil {
    private String merk;
    protected int biaya;

    mobil() {

    }

    public void setMerk(String setMerk) {
        this.merk = setMerk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int setBiaya) {
        this.biaya = setBiaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
