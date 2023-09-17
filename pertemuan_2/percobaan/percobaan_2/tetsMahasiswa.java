package PBO.pertemuan_2.percobaan.percobaan_2;

public class tetsMahasiswa {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        m1.nim = 101;
        m1.nama = "Lestari";
        m1.alamat = "jl.Vionila No.1A";
        m1.kelas = "1A";
        m1.tampilBiodata();
        System.out.println("");
        mahasiswa m2 = new mahasiswa();
        m2.nim = 102;
        m2.nama = "mentari";
        m2.alamat = "jl.vanila No.1B";
        m2.kelas = "1B";
        m2.tampilBiodata();
    }
}
