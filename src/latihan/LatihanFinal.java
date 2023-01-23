package latihan;

import java.util.Random;
import java.util.Scanner;

public class LatihanFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String nim, nama, kelas, jurusan, hasil = null;
        int modalAwal, saldo = 0, pDana, totalDana=0;
        double profit, Hasil=0;

        System.out.print("Masukkan Nama : ");nama = input.nextLine();
        System.out.print("Masukkan NIM : ");nim = input.nextLine();
        System.out.print("Masukkan Kelas : ");kelas = input.nextLine();
        System.out.print("Masukkan Jurusan : ");jurusan = input.nextLine();
        System.out.print("Masukkan jumlah modal awal : ");modalAwal = input.nextInt();
        System.out.println();

        System.out.printf("Nama : %s\n",nama);
        System.out.printf("NIM : %s\n",nim);
        System.out.printf("Kelas : %s\n",kelas);
        System.out.printf("Jurusan : %s\n",jurusan);
        System.out.printf("Modal Awal : %,d\n",modalAwal);
        System.out.println();

        for (int i = 1; i <= 12; i++) {
            pDana = random.nextInt(100000);
            profit = pDana * 0.02;

            if (profit > Hasil) {
                Hasil = profit;
                hasil = "Naik";
            } else if (profit < Hasil) {
                Hasil = profit;
                hasil = "Turun";
            }

            if (i == 1) {
                saldo = modalAwal + pDana;
            } else {
                assert hasil != null;
                if (hasil.equalsIgnoreCase("Naik")) {
                    saldo += pDana;
                } else {
                    saldo -= pDana;
                }
            } totalDana += saldo;

            System.out.printf("Bulan %d\n", i);
            System.out.printf("Perkembangan Dana : %,d\n", pDana);
            System.out.println("Profit : " + profit);
            System.out.printf("Hasil : %s\n", hasil);
            System.out.printf("Saldo : %,d\n", saldo);
            System.out.printf("Total dana : %,d\n", totalDana);
            System.out.println();
        }
    }
}