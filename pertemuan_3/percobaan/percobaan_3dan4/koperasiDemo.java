package PBO.pertemuan_3.percobaan.percobaan_3dan4;

public class koperasiDemo {
    public static void main(String[] args) {
        anggota anggota1 = new anggota("iwan", "jalan mawar");
        System.out.println("simpanan " + anggota1.getNama() + " :Rp." +
                anggota1.getSimpanan());
        anggota1.setNama("setiawan");
        anggota1.setAlamat("jalan sukarno hatta no 10");
        anggota1.setor(100000);
        System.out.println("simpanan " + anggota1.getNama() + " :Rp." +
                anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("simpanan " + anggota1.getNama() + " :Rp." +
                anggota1.getSimpanan());
        // anggota anggota1 = new anggota();
        // anggota1.setNama("iwan setiawan");
        // anggota1.setAlamat("jalan sukarno hatta no 10");
        // anggota1.setor(100000);
        // System.out.println("simpanan " + anggota1.getNama() + " :Rp." +
        // anggota1.getSimpanan());

        // anggota1.pinjam(5000);
        // System.out.println("simpanan " + anggota1.getNama() + " :Rp." +
        // anggota1.getSimpanan());
    }
}
