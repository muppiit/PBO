package PBO.pertemuan_4.percobaan_4;

public class kursi {
    private String nomor;
    private penumpang penumpang;

    kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String setNomor) {
        this.nomor = setNomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(penumpang setPenumpang) {
        this.penumpang = setPenumpang;
    }

    public penumpang getNama() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: \n" + penumpang.info() + "\n";
        }
        return info;
    }
}
