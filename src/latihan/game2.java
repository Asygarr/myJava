package latihan;

import java.util.Random;
import java.util.Scanner;

public class game2 {

    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        String lanjut;
        int stop = 0;
        int loop = 5;

        do {
            //random gigi
            Random random = new Random();
            int gigi = random.nextInt(1,5);

            //Opening
            System.out.println("SELAMAT DATANG DI PERMAINAN GIGITAN BUAYA");
            System.out.println("=========================================");

            //list menu
            int[] err = new int[5];
            String[] Gigi = new String[5];
            for (int i = 0; i <= 4; i++) {
                err[i] = 0;
                if (i == 0) {
                    Gigi[i] = "gigi satu";
                }
                if (i == 1) {
                    Gigi[i] = "gigi dua";
                }
                if (i == 2) {
                    Gigi[i] = "gigi tiga";
                }
                if (i == 3) {
                    Gigi[i] = "gigi empat";
                }
                if (i == 4) {
                    Gigi[i] = "gigi lima";
                }
            }

            //proses game
            for (int i = 1; i <= loop; i++) {
                //input
                System.out.println("Tebak gigi mana yang aman");
                System.out.println("1. " + Gigi[0]);
                System.out.println("2. " + Gigi[1]);
                System.out.println("3. " + Gigi[2]);
                System.out.println("4. " + Gigi[3]);
                System.out.println("5. " + Gigi[4]);
                System.out.print("Masukkan pilihan anda : ");
                int pilihan = input.nextInt();

                //if ke dua kali di pilih
                if (pilihan == 1) {
                    stop += 1;
                    Gigi[0] = "Pilihan sudah di pilih!!";
                    err[0] += 1;
                    if (err[0] == 2) {
                        System.err.println("ANDA SUDAH MEMILIH NOMOR INI SEBELUMNYA!!");
                        System.err.println("PERMAINAN BERAKHIR");
                        break;
                    }
                } if (pilihan == 2) {
                    stop += 1;
                    Gigi[1] = "Pilihan sudah di pilih!!";
                    err[1] += 1;
                    if (err[1] == 2) {
                        System.err.println("ANDA SUDAH MEMILIH NOMOR INI SEBELUMNYA!!");
                        System.err.println("PERMAINAN BERAKHIR");
                        break;
                    }
                } if (pilihan == 3) {
                    stop += 1;
                    Gigi[2] = "Pilihan sudah di pilih!!";
                    err[2] += 1;
                    if (err[2] == 2) {
                        System.err.println("ANDA SUDAH MEMILIH NOMOR INI SEBELUMNYA!!");
                        System.err.println("PERMAINAN BERAKHIR");
                        break;
                    }
                } if (pilihan == 4) {
                    stop += 1;
                    Gigi[3] = "Pilihan sudah di pilih!!";
                    err[3] += 1;
                    if (err[3] == 2) {
                        System.err.println("ANDA SUDAH MEMILIH NOMOR INI SEBELUMNYA!!");
                        System.err.println("PERMAINAN BERAKHIR");
                        break;
                    }
                } if (pilihan == 5) {
                    stop += 1;
                    Gigi[4] = "Pilihan sudah di pilih!!";
                    err[4] += 1;
                    if (err[4] == 2) {
                        System.err.println("ANDA SUDAH MEMILIH NOMOR INI SEBELUMNYA!!");
                        System.err.println("PERMAINAN BERAKHIR");
                        break;
                    }
                }

                //seleksi hasil
                String hasil;
                if (gigi == pilihan) {
                    hasil = "ANDA DI GIGIT BUAYA";
                } else {
                    hasil = "ANDA TIDAK DI GIGIT BUAYA";
                }

                //output hasil
                System.out.println("\n" + hasil);

                //hasil kalah
                if (hasil.equalsIgnoreCase("anda di gigit buaya")) {
                    System.out.println("ANDA KALAH!!\n");
                    break;
                }
                System.out.println("=========================================\n");
            }

            //Stop jika memilih ke dua kali
            if (stop == 2){
                break;
            }

            //Bermain Kembali
            System.out.print("Try again? (yes/no) : ");lanjut = input.next();
            System.out.println();
        } while (lanjut.equalsIgnoreCase("yes"));
    }
}
