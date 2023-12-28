package PBO.quiz_2;

import java.util.List;

public class mahasiswa {
    public String nama;
    public String nim;
    public List<Double> nilai;

    // Konstruktor untuk inisialisasi atribut
    public mahasiswa(String nama, String nim, List<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Metode untuk menghitung IPK berdasarkan nilai
    public double hitungIpk() {
        double totalNilai = 0;
        for (double nilaiMataKuliah : nilai) {
            totalNilai += nilaiMataKuliah;
        }
        return totalNilai / nilai.size();
    }

    // Overload metode hitungIpk dengan memberikan bobot pada setiap mata kuliah
    public double hitungIpk(int[] nilai_sks) {
        double totalNilaiSks = 0;
        int totalSks = 0;

        for (int i = 0; i < nilai.size(); i++) {
            totalNilaiSks += nilai.get(i) * nilai_sks[i];
            totalSks += nilai_sks[i];
        }

        if (totalSks == 0) {
            return 0; // Menghindari pembagian oleh nol
        }

        return totalNilaiSks / totalSks;
    }
}
