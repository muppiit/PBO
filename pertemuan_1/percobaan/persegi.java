package PBO.pertemuan_1.percobaan;

public class persegi {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    int luas() {
        return sisi * sisi;
    }

    int keliling() {
        return 4 * sisi;
    }

    void tampil() {
        System.out.println("---------------------");
        System.out.println("Sisi     : " + sisi);
        System.out.println("Luas     : " + luas());
        System.out.println("Keliling : " + keliling());
        System.out.println("---------------------");
    }
}
