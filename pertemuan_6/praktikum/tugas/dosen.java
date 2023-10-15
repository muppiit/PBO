package PBO.pertemuan_6.praktikum.tugas;

public class dosen extends pegawai {
    public int jumlahSKS = 0;
    public int tarifSKS = 50000;

    public dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        jumlahSKS += sks;
    }

    public int getGaji() {
        gaji = super.getGaji() + (jumlahSKS * tarifSKS);
        return gaji;
    }
}
