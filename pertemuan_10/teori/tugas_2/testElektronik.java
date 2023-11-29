package PBO.pertemuan_10.teori.tugas_2;

public class testElektronik {
    public static void main(String[] args) {
        manusia indro = new manusia();
        televisiJadul tvJadul = new televisiJadul();
        televisiModern tvModern = new televisiModern();

        indro.nyalakanPerangkat(tvJadul);
        indro.nyalakanPerangkat(tvModern);
    }
}
