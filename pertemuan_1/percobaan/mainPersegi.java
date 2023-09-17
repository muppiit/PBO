package PBO.pertemuan_1.percobaan;

import java.util.Scanner;

public class mainPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan sisi : ");
            int sisi = sc.nextInt();

            persegi p = new persegi(sisi);
            p.luas();
            p.keliling();
            p.tampil();
        }
    }
}
