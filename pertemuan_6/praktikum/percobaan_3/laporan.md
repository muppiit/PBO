### Nama : Achmad Mufid

### Kelas : TI - 1C

### NIM : 2241720159

## Pertanyaan

1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!<br>

```java
 public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }
```

Jawab :<br>
kata kunci "super" digunakan untuk merujuk ke superclass dari class tabung. Fungsi "super" digunakan untuk mengakses anggota (atribut atau metode) dari superclass.

2.  Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!<br>

```java
public void volume() {
   System.out.println("volume tabung adalah :" + (super.phi * super.r * super.r * this.t));
}
```

Jawab :<br>

- Kata kunci "super" digunakan untuk merujuk ke anggota (atribut atau metode) dari superclass.
  Jadi super.phi dan super.r merujuk pada atribut phi dan r yang ada pada class bangun.
- Kata kunci "this" digunakan untuk merujuk ke anggota (atribut atau metode) dari class saat ini.
  Jadi this.t merujuk pada atribut t pada class tabung.

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!<br>
   Jawab : <br>
   Dikarenakan class tabung mempunyai hubungan Inheritance dengan class bangun dimana class tabung mewarisi atribut dari class bangun.
