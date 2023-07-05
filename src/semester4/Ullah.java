package semester4;

import java.util.Scanner;

public class Ullah {

    private static String[] daftarPenyakit = {
            "Eksim", "Psoriasis", "Urtikaria", "Jerawat"
    };

    private static String[][] daftarGejala = {
            {"Gatal-gatal", "Kemerahan", "Bengkak", "Lecet"},
            {"Kulit bersisik", "Plak berwarna perak", "Gatal-gatal"},
            {"Bintik-bintik merah", "Gatal-gatal", "Muncul dan menghilang"},
            {"Komedo", "Papula", "Pustula", "Nodul", "Kista"}
    };

    private static String[][] aturanDiagnosa = {
            {"Eksim", "Gatal-gatal", "Kemerahan", "Bengkak", "Lecet"},
            {"Psoriasis", "Kulit bersisik", "Plak berwarna perak", "Gatal-gatal"},
            {"Urtikaria", "Bintik-bintik merah", "Gatal-gatal", "Muncul dan menghilang"},
            {"Jerawat", "Komedo", "Papula", "Pustula", "Nodul", "Kista"}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Pakar Diagnosa Penyakit Kulit!");
        System.out.println("Silakan jawab pertanyaan berikut untuk mendapatkan diagnosa penyakit kulit.");

        // Menampilkan gejala dan menerima jawaban dari pengguna
        for (int i = 0; i < daftarGejala.length; i++) {
            System.out.println();
            System.out.println("Apakah Anda mengalami gejala-gejala berikut?");
            for (int j = 0; j < daftarGejala[i].length; j++) {
                System.out.println((j+1) + ". " + daftarGejala[i][j]);
            }
            System.out.print("Jawaban Anda (ya/tidak): ");
            String jawaban = input.nextLine();
            boolean gejalaCocok = true;
            if (jawaban.equalsIgnoreCase("ya")) {
                // Cek apakah gejala cocok dengan aturan diagnosa

                for (int k = 1; k < aturanDiagnosa[i].length; k++) {
                    boolean gejalaDitemukan = false;
                    for (int l = 0; l < daftarGejala[i].length; l++) {
                        if (daftarGejala[i][l].equalsIgnoreCase(aturanDiagnosa[i][k])) {
                            gejalaDitemukan = true;
                            break;
                        }
                    }
                    if (!gejalaDitemukan) {
                        gejalaCocok = false;
                        break;
                    }
                }
            }
            if (gejalaCocok) {
                System.out.println("Anda kemungkinan mengalami penyakit " + aturanDiagnosa[i][0]);
            }else {
                System.out.println("Anda mungkin kurang Istirahat");
            }
        }

        input.close();
    }

}
