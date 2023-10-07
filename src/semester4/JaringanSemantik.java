package semester4;

import java.util.Scanner;

public class JaringanSemantik {

    public static void main(String[] args) {
        String[] gejala = {
                "Demam", "Batuk Kering", "Sesak Napas", "Pusing", "Mual",
                "Lemas", "Ruam Kulit", "Nyeri Sendi", "Muntah", "Kelelahan"
        };

        String[] penyakit = {
                "COVID-19", "Influenza", "Asma", "Dengue"
        };

        String[][] jaringanSemantik = {
                // Demam - Batuk Kering - Sesak Napas - Pusing - Mual - Lemas - Ruam Kulit - Nyeri Sendi - Muntah - Kelelahan
                {"ya", "ya", "ya", "tidak", "tidak", "tidak", "tidak", "tidak", "tidak", "tidak"},
                {"ya", "ya", "ya", "tidak", "tidak", "ya", "tidak", "ya", "tidak", "ya"},
                {"tidak", "tidak", "ya", "ya", "tidak", "tidak", "tidak", "tidak", "tidak", "tidak"},
                {"ya", "tidak", "tidak", "tidak", "ya", "tidak", "ya", "tidak", "ya", "tidak"}
        };

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan gejala yang anda rasakan (Ya, Tidak):");
        String[] gejalaUser = new String[gejala.length];
        for (int i = 0; i < gejala.length; i++) {
            System.out.print(gejala[i] + ": ");
            gejalaUser[i] = input.nextLine();
        }

        int[] bobot = new int[penyakit.length];
        for (int i = 0; i < penyakit.length; i++) {
            for (int j = 0; j < gejala.length; j++) {
                if (gejalaUser[j].equals(jaringanSemantik[i][j])) {
                    bobot[i] += 1;
                }
            }
        }

        int indexPenyakit = 0;
        boolean terkenaPenyakit = false;
        boolean kemungkinanTerkenaPenyakit = false;
        for (int i = 0; i < penyakit.length; i++) {
            if (bobot[i] == 10) {
                indexPenyakit = i;
                terkenaPenyakit = true;
            } else if (bobot[i] > 7) {
                indexPenyakit = i;
                kemungkinanTerkenaPenyakit = true;
            }
        }

        System.out.println("\nHasil diagnosa:");

        if (terkenaPenyakit) {
            System.out.println("Anda terkena penyakit " + penyakit[indexPenyakit]);
        } else if (kemungkinanTerkenaPenyakit) {
            System.out.println("Anda kemungkinan terkena penyakit " + penyakit[indexPenyakit]);
        } else {
            System.out.println("Penyakit tidak terdeteksi");
        }


    }
}
