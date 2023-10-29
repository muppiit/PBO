package PBO.uts.no_5;

public class buku extends penulis {
    String isbn, judul;
    penulis penulis;
    int harga;

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    String getJudul() {
        return judul;
    }

    void setJudul(String judul) {
        this.judul = judul;
    }

    int getHarga() {
        return harga;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    penulis getPenulis() {
        return penulis;
    }

    void setPenulis(penulis penulis) {
        this.penulis = penulis;
    }
}
