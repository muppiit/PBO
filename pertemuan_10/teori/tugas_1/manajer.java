package PBO.pertemuan_10.teori.tugas_1;

public class manajer extends pegawai {
    private int tunjangan;

    manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
