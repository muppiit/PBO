package PBO.pertemuan_9.tugas.tugas2;

public class main {
    public static void main(String[] args) {
        // Method dynamic dispatch
        dosen d = new dosen();
        mahasiswa m = new mahasiswa();
        d.makan();
        m.makan();
    }
}
