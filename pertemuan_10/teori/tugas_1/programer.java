package PBO.pertemuan_10.teori.tugas_1;

public class programer extends pegawai {
    private int bonus;

    programer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getBonus() {
        return bonus;
    }
}
