package tugas3;

import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i+ " adalah bilangan ganjil");
//            } else {
//                System.out.println(i+ " adalah bilangan genap");
//            }
//        }

//        int tugas = 60;
//        int mid = 70;
//        int finsl= 80;
//        int hadir = 7;
//        int kehadiran = hadir * 10;
//
//        int nilaiAkhir = (int) ((kehadiran * (10 / 100)) + (tugas * (20 / 100)) + (mid * (30 / 100)) + (finsl * (40 / 100)));
//        System.out.println(nilaiAkhir);

        Scanner baca = new Scanner(System.in);
        String nama, kelas,semester, nim;
        int jumlahKehadiran;
        double tugas, mid, finl, akhir, kehadiran;
        String nhuruf;

        System.out.print("masukkan nim : ");
        nim = baca.nextLine();
        System.out.print("masukkan Nama : ");
        nama = baca.nextLine();
        System.out.print("masukkan Semester : ");
        semester = baca.nextLine();
        System.out.print("masukkan Kelas : ");
        kelas = baca.nextLine();
        System.out.print("masukkan jumlah kehadiran : ");
        jumlahKehadiran = baca.nextInt();
        System.out.print("masukkan nilai akumulasi tugas : ");
        tugas = baca.nextDouble();
        System.out.print("masukkan nilai akumulasi mid : ");
        mid = baca.nextDouble();
        System.out.print("masukkan nilai akumulasi final : ");
        finl = baca.nextDouble();

        kehadiran = jumlahKehadiran * 6.25;
        akhir = (kehadiran * 0.1) + (tugas * 0.2) + (mid * 0.3) + (finl * 0.4);

        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Semester : "+semester);
        System.out.println("Kelas : "+kelas);
        System.out.println("Nilai Kehadiran : "+kehadiran);
        System.out.println("Nilai Tugas : "+tugas);
        System.out.println("Nilai Mid : "+mid);
        System.out.println("Nilai Final : "+finl);
        System.out.println("====================================");
        System.out.println("Nilai Akhir adalah :"+akhir);
        if ((akhir >=81) && (akhir<=100)) //Jika nilai akhir di antara 80-100
            System.out.print("Nilai Huruf : A");
        else if ((akhir >=71) && (akhir<=81)) //Jika nilai akhir di antara 70-80
            System.out.print("Nilai Huruf : B");

        else if ((akhir >=55) && (akhir<=71)) //Jika nilai akhir di antara 55-70
            System.out.print("Nilai Huruf : C");

        else if ((akhir >=31) && (akhir<=55)) //Jika nilai akhir di antara 31-54
            System.out.print("Nilai Huruf : D");

        else if ((akhir<31)) //Jika nilai akhir di antara 0-30
            System.out.println("Nilai Huruf : E");

    }
}
