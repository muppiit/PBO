package PBO.pertemuan_6.teori;

public class lingkaran extends bangunDatar {
    private float jariJari;

    public lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public float hitungLuas() {
        return (float) (Math.PI * jariJari * jariJari);
    }

    @Override
    public float hitungKeliling() {
        return (float) (2 * Math.PI * jariJari);
    }

    public void tampil() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
