package PBO.pertemuan_6.teori;

public class persegiPanjang extends bangunDatar {
    private float panjang;
    private float lebar;

    public persegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void tampil() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
