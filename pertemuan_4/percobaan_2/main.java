package PBO.pertemuan_4.percobaan_2;

public class main {
    public static void main(String[] args) {
        mobil m = new mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        sopir s = new sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        pelanggan p = new pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
