package PBO.pertemuan_4.percobaan_4;

public class main {
    public static void main(String[] args) {
        penumpang p = new penumpang("12345", "Mr. Krab");
        gerbong gerbong = new gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
