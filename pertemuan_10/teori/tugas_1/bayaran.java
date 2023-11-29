package PBO.pertemuan_10.teori.tugas_1;

public class bayaran {
    public int hitungBayaran(pegawai pg) {
        int uang = pg.getGaji();

        if (pg instanceof manajer) {
            uang += ((manajer) pg).getTunjangan();
        } else if (pg instanceof programer) {
            uang += ((programer) pg).getBonus();
        }

        return uang;
    }
}
