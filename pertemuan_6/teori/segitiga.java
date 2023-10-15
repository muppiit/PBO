package PBO.pertemuan_6.teori;

public class segitiga extends bangunDatar {
    private float alas;
    private float tinggi;

    public segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float hitungLuas() {
        return 0.5f * alas * tinggi;
    }

    public void tampil() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + hitungLuas());
    }
}
