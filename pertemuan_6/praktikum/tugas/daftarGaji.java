package PBO.pertemuan_6.praktikum.tugas;

public class daftarGaji {
    private pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;

    public daftarGaji(int jumlah_pegawai) {
        listPegawai = new pegawai[jumlah_pegawai];
    }

    public void addPegawai(pegawai p) {
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawaiSekarang; i++) {
            System.out.print(listPegawai[i].getNama() + " mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
