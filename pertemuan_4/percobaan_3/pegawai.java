package PBO.pertemuan_4.percobaan_3;

public class pegawai {
    private String nip, nama;

    pegawai() {

    }

    pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String setNip) {
        this.nip = setNip;
    }

    public String getNip() {
        return nip;
    }

    public void setNama(String setNama) {
        this.nama = setNama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = " \n";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
