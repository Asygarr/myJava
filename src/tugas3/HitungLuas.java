package tugas3;

import java.util.Scanner;

public class HitungLuas {

    public static void main(String[] args) {
        String ulang;

        double luas;
        double panjang;
        double lebar;
        double tinggi;

        do {
            System.out.println("Program Hitung Luas:");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Segitiga");
            System.out.println("4. Luas Jajaran Genjang");
            System.out.println("5. Luas Trapesium");
            System.out.println("6. Luas Lingkaran");
            System.out.println("7. Luas Belah Ketupat");
            System.out.println("8. Luas Layang-layang");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pilihan : ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi: " + luas);
            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang: ");
                panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                lebar = scanner.nextDouble();
                luas = panjang * lebar;
                System.out.println("Luas Persegi Panjang: " + luas);
            } else if (pilihan == 3) {
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = scanner.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga: " + luas);
            } else if (pilihan == 4) {
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = scanner.nextDouble();
                luas = alas * tinggi;
                System.out.println("Luas Jajaran Genjang: " + luas);
            } else if (pilihan == 5) {
                System.out.print("Masukkan panjang atas: ");
                double panjangAtas = scanner.nextDouble();
                System.out.print("Masukkan panjang bawah: ");
                double panjangBawah = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = scanner.nextDouble();
                luas = 0.5 * (panjangAtas + panjangBawah) * tinggi;
                System.out.println("Luas Trapesium: " + luas);
            } else if (pilihan == 6) {
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                luas = Math.PI * jariJari * jariJari;
                System.out.println("Luas Lingkaran: " + luas);
            } else if (pilihan == 7) {
                System.out.print("Masukkan diagonal 1: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double diagonal2 = scanner.nextDouble();
                luas = 0.5 * diagonal1 * diagonal2;
                System.out.println("Luas Belah Ketupat: " + luas);
            } else if (pilihan == 8) {
                System.out.print("Masukkan diagonal 1: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double diagonal2 = scanner.nextDouble();
                luas = 0.5 * diagonal1 * diagonal2;
                System.out.println("Luas Layang-layang: " + luas);
            } else {
                System.out.println("Pilihan tidak valid!");
            }


            System.out.print("ulang? (y/n)");
            ulang = scanner.next();
        } while (ulang.equalsIgnoreCase("y"));


    }

}
