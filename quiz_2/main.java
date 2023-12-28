package PBO.quiz_2;

import java.text.DecimalFormat;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Membuat beberapa objek mahasiswa dan mata kuliah
        mahasiswa mahasiswa1 = new mahasiswa("John Doe", "12345", List.of(3.5, 4.0, 3.7));
        mahasiswa mahasiswa2 = new mahasiswa("Jane Smith", "67890", List.of(3.8, 3.5, 4.0));

        mataKuliah mataKuliah1 = new mataKuliah("Pemrograman Java", 3, List.of(3.7, 4.0, 3.8));
        mataKuliah mataKuliah2 = new mataKuliah("Basis Data", 4, List.of(3.5, 4.0, 3.9));

        // Menentukan bobot SKS untuk setiap mata kuliah
        int[] bobotSksMataKuliah1 = { 3, 4, 3 }; // Bobot SKS untuk setiap mata kuliah pada mataKuliah1
        double bobotMahasiswaMataKuliah2 = 1.2; // Bobot mahasiswa untuk mataKuliah2

        // Simulasi proses perwalian
        perwalian perwalian = new perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(mataKuliah1);
        perwalian.tambahMataKuliah(mataKuliah2);

        // Cetak hasil perwalian
        perwalian.cetakDataPerwalian();

        // Menggunakan metode yang di-overload
        double ipkMahasiswa1Overload = mahasiswa1.hitungIpk(bobotSksMataKuliah1);
        double bobotMataKuliah1Overload = mataKuliah1.hitungBobot(bobotMahasiswaMataKuliah2);

        // Memformat output untuk hanya menampilkan satu angka desimal
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String formattedIpkMahasiswa1 = decimalFormat.format(ipkMahasiswa1Overload);
        String formattedBobotMataKuliah1 = decimalFormat.format(bobotMataKuliah1Overload);

        System.out.println("IPK Mahasiswa 1 (dengan overload): " + formattedIpkMahasiswa1);
        System.out.println("Bobot Mata Kuliah 1 (dengan overload): " + formattedBobotMataKuliah1);
    }
}
