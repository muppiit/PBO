package PBO.pertemuan_4.percobaan_1;

public class main {
    public static void main(String[] args) {
        processor p = new processor("intel i5", 3);
        laptop l = new laptop("thinkpad", p);

        l.info();
        processor p1 = new processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        laptop L1 = new laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();

    }
}
