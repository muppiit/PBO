### Nama : Achmad Mufid

### Kelas : TI - 1C

### NIM : 2241720159

## Pertanyaan

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!<br>
   Jawab :<br>

```java
public class classB extends classA {
    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah : " + (x + y + z));
    }
}

```

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!<br>
   Jawab :<br>
   Dikarenakan classA dan classB tidak memiliki hubungan.
