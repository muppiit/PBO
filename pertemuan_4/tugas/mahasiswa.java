package PBO.pertemuan_4.tugas;

public class mahasiswa {
    private String nim;
    private String namaMahasiswa;

    public mahasiswa(String nama, String nim) {
        this.namaMahasiswa = nama;
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.namaMahasiswa = nama;
    }

    public String getNama() {
        return namaMahasiswa;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;

    }
}
