package PBO.pertemuan_4.tugas;

public class petugas {
    private String NIP;
    private String namaPetugas;

    public petugas(String nama, String nip) {
        this.namaPetugas = nama;
        this.NIP = nip;
    }

    public void setNIP(String nip) {
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }
}
