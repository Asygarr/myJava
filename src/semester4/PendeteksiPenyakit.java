package semester4;

import java.util.Scanner;

public class PendeteksiPenyakit {

    public static void main(String[] args) {
        String[][] penyakitan = {
                // Hipertensi
                {"Hipertensi", "Pandangan kabur", "Lelah", "Pusing", "Nyeri dada", "Sesak napas", "Palpitasi", "Nyeri pada bagian belakang kepala", "Kesemutan"},
                // Influenza
                {"Influenza", "Pilek", "Batuk", "Demam", "Sakit tenggorokan", "Sakit kepala", "Nyeri otot", "Menggigil", "Mual"},
                // Diabetes
                {"Diabetes", "Poliuria", "Polidipsia", "Polifagia", "Penurunan berat badan", "Luka yang sulit sembuh"},
                // Asma
                {"Asma", "Sesak napas", "Mengi", "Batuk parah", "Dada tertekan", "Gangguan tidur"}
        };

        int[] counterPenyakit = new int[penyakitan.length];
        boolean tidakAdaPenyakit = false;
        int[] nilaiAkhirGejala = new int[penyakitan.length];
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi pendeteksi penyakit");
        System.out.println("Silahkan jawab pertanyaan berikut ini dengan jawaban \"ya\" atau \"tidak\"\n");

        // Isi Pertanyaan
        outerLoop: for (int i = 0; i < penyakitan.length; i++) {
            counterPenyakit[i] = 0;
            for (int j = 1; j < penyakitan[i].length; j++) {
                System.out.println("Apakah anda mengalami gejala " + penyakitan[i][j] + "?");
                System.out.print("Jawaban: ");
                String jawaban = input.nextLine();

                if (j == 1 && jawaban.equals("tidak")) {
                    continue outerLoop;
                }

                if (jawaban.equals("ya")) {
                    counterPenyakit[i]++;
                }
            }

        }

        // Hasil
        System.out.println("\nHasil: ");
        for (int i = 0; i < penyakitan.length; i++) {
            if (counterPenyakit[i] >= (penyakitan[i].length-1)/2) {
                nilaiAkhirGejala[i] = counterPenyakit[i];
                tidakAdaPenyakit = false;
                break;
            } else {
                tidakAdaPenyakit = true;
            }
        }

        int penyakitTerbesar = 0;
        int penyakitTerbesarIndex = 0;
        for (int i = 0; i < nilaiAkhirGejala.length; i++) {
            if (nilaiAkhirGejala[i] > penyakitTerbesar) {
                penyakitTerbesar = nilaiAkhirGejala[i];
                penyakitTerbesarIndex = i;
            }
        }

        if (tidakAdaPenyakit) {
            System.out.println("Anda tidak mengalami penyakit apapun");
        } else {
            System.out.println("Anda mengalami penyakit " + penyakitan[penyakitTerbesarIndex][0]);
        }

        System.out.println("\nTerima kasih telah menggunakan aplikasi ini");
    }

}
