package PBO.pertemuan_1.percobaan;

public class main {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa("2241720159", "Achmad Mufid", "tuban");
        dosen d1 = new dosen("15615", "baba");
        matkul mk1 = new matkul("PBO", 3, 100);
        m1.tampildataMhs();
        d1.tampilDataDosen();
        mk1.tampil();
    }
}
