package PBO.pertemuan_4.percobaan_1;

public class laptop {
    private String merk;
    private processor proc;

    public laptop() {

    }

    public laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String setMerk) {
        this.merk = setMerk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(processor setProc) {
        this.proc = setProc;
    }

    public processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk laptop = " + merk);
        proc.info();
    }

}
