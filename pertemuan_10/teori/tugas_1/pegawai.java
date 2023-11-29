package PBO.pertemuan_10.teori.tugas_1;

public class pegawai {
    protected String nama;
    protected int gaji;

    pegawai() {

    }

    pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}