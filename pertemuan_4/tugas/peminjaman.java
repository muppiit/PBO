package PBO.pertemuan_4.tugas;

public class peminjaman {
    public buku pinjamanBuku;
    public mahasiswa peminjam;
    public petugas petugas;

    public void traksasiPinjam(mahasiswa mahasiswa, buku buku, petugas petugas) {
        this.peminjam = mahasiswa;
        this.pinjamanBuku = buku;
        this.petugas = petugas;
    }

    public String info() {
        String p = "";
        p += "=======================================================================\n";
        p += "=======================Traksasi Peminjaman=============================\n";
        p += "=======================================================================\n";
        p += "||Peminjam\t: " + peminjam.getNama() + "\t||nim : " + peminjam.getNim() + "||\n";
        p += "||Meminjam Buku\t: " + pinjamanBuku.getJudul() + "\t||Penerbit : " + pinjamanBuku.getTerbit() + "||\n";
        p += "||Dilayani\t: Petugas " + petugas.getNamaPetugas() + "\t||NIP : " + petugas.getNIP() + "||\n";
        p += "=======================================================================";
        return p;
    }
}
