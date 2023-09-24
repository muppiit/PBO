package PBO.pertemuan_4.percobaan_3;

public class main {
    public static void main(String[] args) {
        pegawai masinis = new pegawai("1234", "Spongebob Squarepants");
        pegawai asisten = new pegawai("4567", "Patrick Star");
        keretaApi keretaApi = new keretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
