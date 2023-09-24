package PBO.pertemuan_4.percobaan_4;

public class penumpang {
    private String ktp, nama;

    penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtp(String setktp) {
        this.ktp = setktp;
    }

    public String getKtp() {
        return ktp;
    }

    public void setNama(String setNama) {
        this.nama = setNama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
