package PBO.pertemuan_2.tugas.tugas_2;

public class lingkaran {
    double phi, jari;

    public lingkaran(double phi, double jari) {
        this.phi = phi;
        this.jari = jari;
    }

    double hitungLuas() {
        double luas = phi * jari * jari;
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * phi * jari;
        return keliling;
    }

    void tampil() {
        System.out.println("\n----------------------------");
        System.out.println("Phi\t\t: " + phi);
        System.out.println("Jari-jari\t: " + jari);
        System.out.println("----------------------------");
        System.out.println("Luas lingkaran\t: " + hitungLuas());
        System.out.println("Luas keliling\t: " + hitungKeliling());
        System.out.println("----------------------------");
    }
}
