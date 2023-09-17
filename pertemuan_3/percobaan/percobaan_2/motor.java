package PBO.pertemuan_3.percobaan.percobaan_2;

public class motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
            if (this.kecepatan == 100) {
                kurangiKecepatan();
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
