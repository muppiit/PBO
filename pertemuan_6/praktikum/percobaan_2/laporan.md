### Nama : Achmad Mufid

### Kelas : TI - 1C

### NIM : 2241720159

## Pertanyaan

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!<br>
   Jawab :<br>

```java
public class classA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void getNilai() {
        System.out.println("nilai x : " + x);
        System.out.println("nilai y : " + y);
    }
}
```

```java
public class classB extends classA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (getX() + getY() + z));
    }
}
```

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!<br>
   Jawab : <br>
   Dikarenakan atribut pada classA diatur private oleh karena itu harus dibuatnya method geter pada classA agar atribut bisa digunakan di class lain.
