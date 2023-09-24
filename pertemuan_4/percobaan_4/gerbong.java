package PBO.pertemuan_4.percobaan_4;

public class gerbong {
    private String kode;
    kursi[] arrayKursi;

    gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String setkode) {
        this.kode = setkode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    public kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
