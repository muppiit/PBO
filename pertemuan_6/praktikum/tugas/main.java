package PBO.pertemuan_6.praktikum.tugas;

public class main {
    public static void main(String[] args) {
        pegawai pegawai = new pegawai("12345", "budi", "Malang");

        dosen dosen = new dosen("18123", "jamal", "Malang");
        dosen.setSKS(6);

        daftarGaji daftarGaji = new daftarGaji(2);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);

        daftarGaji.printSemuaGaji();

    }
}
