package PBO.pertemuan_1.percobaan;

public class dosen {
    public String nip, nama;

    public dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void tampilDataDosen() {
        System.out.println("---------------------------------");
        System.out.println("              Dosen              ");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("NIP\t  : " + nip);
        System.out.println("Nama\t : " + nama);
        System.out.println("---------------------------------");
    }
}
