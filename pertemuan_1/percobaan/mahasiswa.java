package PBO.pertemuan_1.percobaan;

public class mahasiswa {
    public String nim, nama, alamat;

    public mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampildataMhs() {
        System.out.println("---------------------------------");
        System.out.println("            Mahasiswa            ");
        System.out.println("---------------------------------");
        System.out.println("NIM\t  : " + nim);
        System.out.println("Nama\t : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("---------------------------------");
    }

}
