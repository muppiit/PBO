package PBO.pertemuan_6.praktikum.tugas;

public class main {
    public static void main(String[] args) {
        // Pegawai non dosen
        pegawai p1 = new pegawai("2001", "Atma", "Kediri");
        pegawai p2 = new pegawai("2002", "Yanti", "Blitar");
        // Dosen
        dosen d1 = new dosen("2003", "Budi", "Malang");
        d1.setSKS(20);
        dosen d2 = new dosen("2004", "Fitri", "Nganjuk");
        d2.setSKS(25);

        daftarGaji gaji1 = new daftarGaji(5000000);
        gaji1.addPegawai(p1);
        gaji1.addPegawai(p2);
        gaji1.addPegawai(d1);
        gaji1.addPegawai(d2);
        gaji1.printSemuaGaji();
    }
}
