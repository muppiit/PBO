package PBO.pertemuan_1.percobaan;

public class matkul {
    String namaMatkul;
    int nilai, sks;

    public matkul(String namaMatkul, int sks, int nilai) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    int inputNilai(int input) {
        nilai = input;
        return input;
    }

    int updateNilai(int update) {
        nilai = update;
        return update;
    }

    void tampil() {
        System.out.println("---------------------------------");
        System.out.println("            Matakuliah           ");
        System.out.println("---------------------------------");
        System.out.println("Nama : " + namaMatkul);
        System.out.println("sks : " + sks);
        System.out.println("Nilai : " + nilai);
    }

}
