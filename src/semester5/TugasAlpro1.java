package semester5;

public class TugasAlpro1 {

    public static void main(String[] args) {

        contoh1();
        contoh2();
        contoh3();

    }

    public static void contoh1() {
        // Contoh 1 analisis efektivitas algoritma dari segi ruang dan waktu dengan for
        int n = 10, total = 0, i; // ini dihitung 3 kali eksekusi karena ada 3 variabel

        for (i = 1; i <= n; i++) {
            total = total + i; // n (10) kali eksekusi
        }
        int rata= total / n; // 1 kali eksekusi

        System.out.println("Rata-rata = " + rata); // 1 kali eksekusi

        // Contoh 2 analisis efektivitas algoritma dari segi ruang dan waktu dengan do while
        int n2 = 10, total2 = 0, i2 = 0; // ini dihitung 3 kali eksekusi karena ada 4 variabel

        do {
            total2 = total2 + i2; // n (10) kali eksekusi
            i2++; // n (10) kali eksekusi
        } while (i2 < n2); // n (10) kali eksekusi
        int rata2 = total2 / n2; // 1 kali eksekusi

        System.out.println("Rata-rata = " + rata2); // 1 kali eksekusi
    }

    public static void contoh2() {
        int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 1 kali eksekusi || panjang sebuah array = n (15)

        // Algotitma mencari bilangan prima dengan for
        for (int num : bilangan) {
            boolean isPrime = true; // 1 x n = 15

            // Operasi dasar
            for (int k = 2; k <= Math.sqrt(num); k++) { // 1 x n = 15 || Operasi Aritmatika
                if (num % k == 0) { // 1 x n = 15 || Operasi Aritmatika dan Perbandingan
                    isPrime = false; // 1 x n = 15 || Operasi Penugasan
                    break; // 1 x n = 15
                }
            }
            if (isPrime) { // 1 x n = 15 || Operasi Perbandingan
                System.out.print(num + " "); // 1 x n = 15
            }
        }

        int[] bilangan2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 1 kali eksekusi || panjang sebuah array = n (15)
        int l = 0; // 1 kali eksekusi

        // Algoritma mencari bilangan prima dengan do while
        do {
            boolean isPrime = true; // 1 x n = 15

            // Operasi dasar
            for (int j = 2; j <= Math.sqrt(bilangan2[l]); j++) { // 1 x n = 15 || Operasi Aritmatika
                if (bilangan2[l] % j == 0) { // 1 x n = 15 || Operasi Aritmatika dan Perbandingan
                    isPrime = false; // 1 x n = 15 || Operasi Penugasan
                    break; // 1 x n = 15
                }
            }
            if (isPrime) { // 1 x n = 15 || Operasi Perbandingan
                System.out.print(bilangan2[l] + " "); // 1 x n = 15
            }

            l++; // 1 x n = 15
        } while (l < bilangan2.length); // 1 x n = 15
    }

    public static void contoh3() {
        int[] num = {1, 5, 3, 4, 2}; // angka terbesar berada pada index 1
        int besar = 0;

        // algoritma
        for (int j : num) {

            // operasi dasar di ekskusi hanya 2 kali
            if (j > besar) { // operasi perbandingan
                besar = j; // operasi penugasan
            }

        }

        System.out.println("Bilangan terbesar = " + besar);
    }
}
