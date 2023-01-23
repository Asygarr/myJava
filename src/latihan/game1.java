package latihan;

import java.util.Random;
import java.util.Scanner;

public class game1 {

    public static void main(String[] args) {
        // Game Gunting Kertas
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String repeat;
        do {
            // menu informasi
            System.out.println("\n==================================");
            System.out.println("Pilih Tangan Anda : ");
            System.out.println("1. Gunting");
            System.out.println("2. Kertas");
            System.out.println("3. Batu\n");

            // input player
            System.out.print("Masukkan pilihan anda : ");
            int tangan = input.nextInt();
            System.out.println();

            String Tangan = null; // Player
            if (tangan == 1) {
                Tangan = "GUNTING";
            } else if (tangan == 2) {
                Tangan = "KERTAS";
            } else if (tangan == 3) {
                Tangan = "BATU";
            }

            int hand = random.nextInt(3);
            String Hand; // Lawan Komputer
            if (hand == 0) {
                Hand = "GUNTING";
            } else if (hand == 1) {
                Hand = "BATU";
            } else {
                Hand = "KERTAS";
            }

            // proses hasil
            String hasil = null;
            if (tangan == 1 && hand == 0) {
                hasil = "IMBANG";
            } else if (tangan == 1 && hand == 1) {
                hasil = "KALAH";
            } else if (tangan == 1) {
                hasil = "MENANG";
            }

            if (tangan == 2 && hand == 2) {
                hasil = "IMBANG";
            } else if (tangan == 2 && hand == 0) {
                hasil = "KALAH";
            } else if (tangan == 2) {
                hasil = "MENANG";
            }

            if (tangan == 3 && hand == 1) {
                hasil = "IMBANG";
            } else if (tangan == 3 && hand == 2) {
                hasil = "KALAH";
            } else if (tangan == 3) {
                hasil = "MENANG";
            }

            // output
            System.out.println("Tangan yang anda pilih : " + Tangan);
            System.out.println("Tangan komputer : " + Hand + "\n");
            System.out.println("HASIL : ANDA " + hasil + "\n");

            System.out.print("Main Lagi? (yes/no) : "); repeat = input.next();
        } while (repeat.equalsIgnoreCase("yes"));

    }
}
