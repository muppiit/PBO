package PBO.pertemuan_3.percobaan.percobaan_1;

public class motorEncapsulation {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("kontak on");
        } else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
