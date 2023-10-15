package PBO.pertemuan_6.praktikum.tugas;

import java.util.ArrayList;

public class daftarGaji {
    public int gaji;
    public pegawai[] listPegawai;

    ArrayList<pegawai> listPeg = new ArrayList();

    public daftarGaji(int gaji) {
        this.gaji = gaji;
    }

    public void addPegawai(pegawai p) {
        p.gaji = p.getGaji() + this.gaji;
        listPeg.add(p);
    }

    public void printSemuaGaji() {
        System.out.println("NIP\t| Nama\t| Alamat\t| Gaji");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < listPeg.size(); i++) {
            System.out.println(listPeg.get(i).nip + "\t| " + listPeg.get(i).nama +
                    "\t| " + listPeg.get(i).alamat + "\t| " + listPeg.get(i).gaji);
        }
    }
}
