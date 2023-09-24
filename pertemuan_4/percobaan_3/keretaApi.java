package PBO.pertemuan_4.percobaan_3;

public class keretaApi {
    private String nama, kelas;
    private pegawai masinis, asisten;

    keretaApi() {
    }

    keretaApi(String nama, String kelas, pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    keretaApi(String nama, String kelas, pegawai masinis, pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String setNama) {
        this.nama = setNama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas(String setKelas) {
        this.kelas = setKelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMasinis(pegawai masinis) {
        this.masinis = masinis;
    }

    public pegawai getMasinis() {
        return masinis;
    }

    public void setAsisten(pegawai setAsisten) {
        this.asisten = setAsisten;
    }

    public pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
