### Nama : Achmad Mufid

### Kelas : TI-2C

### NIM : 2241720159

### Pertanyaan Percobaan 2

1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?<br>
   Jawab : <br>

- Single: Karyawan-Manager
- Multilevel: Karyawan-Staff-StaffTetap, Karyawan-Staff-StaffHarian

2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!<br>
   Jawab : <br>
   a. Atribut class StaffTetap : golongan, asuransi
   b. Atribut class StaffHarian : jmlJamKerja
   c. Atribut yang diwarisi dari class Staff : lembur dan potongan. Karena class Staff diwarisi dari class Karyawan, maka ada atribut yang diwarisi dari class karyawan juga, diantaranya yaitu : nama, alamat, jk, umur, gaji

3. Apakah fungsi potongan program berikut pada class StaffHarian<br>

   ```java
   super(lembur, potongan, nama, alamat, jk, umur, gaji);
   ```

   Jawab : <br>

   Fungsinya untuk memanggil konstruktor berparameter dari class Staff

4. Apakah fungsi potongan program berikut pada class StaffHarian<br>

   ```java
   super.tampilDataStaff();
   ```

   Jawab : <br>
   Fungsinya untuk memanggil method tampilDataStaff() dari class Staff

5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap

   ```java
   System.out.println("Gaji Bersih     = " + (gaji + lembur - potongan - asuransi));
   ```

   Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji,lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur,dan potongan?<br>
   Jawab : <br>

   Karena pada class StaffTetap telah di extends class Staff sehingga atribut Gaji, Lembur dan potongan pada class Staff dapat di akses oleh class StaffTetap
