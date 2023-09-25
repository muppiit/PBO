<h2>Nama : Achmad Mufid<br>
Kelas :TI-1C<br>
NIM : 2241720159</h2>

<h3>Hasil Percobaan</h3>
<img src = "hasil.png">

<h3>Pertanyaan</h3>

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam
   Gerbong A ?<br>
   jumlah kursi dalam gerbong A adalah 10.
2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode
   tersebut ?

```java
if (this.penumpang != null) {
info += "Penumpang: " + penumpang.info() + "\n";
}
```

jika kursi sudah ada penumpang maka data penumpang akan di tampilkan.

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi
   dengan angka 1 ?<br>
   karena dalam array dimulai dari indeks 0.
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru
   tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?<br>
   menambah data penumoang.

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
   penumpang lain !
   ```java
   public void setPenumpang(Penumpang penumpang, int nomor){
        for (int i = 0; i < arrayKursi.length; i++) {
            Kursi kursi = arrayKursi[i];
            if(Integer.parseInt(kursi.getNomor()) == nomor && kursi.getPenumpang() != null){
                System.out.println("Maaf, kursi nomor " + nomor + " sudah ada penumpang!\n");
                break;
            } else {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
                break;
            }
        }
   ```
