package semester5;

public class TugasAlpro1 {

    public static void main(String[] args) {

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

        // Algotitma mencari bilangan prima dengan for
        int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 1 kali eksekusi

        System.out.println("Bilangan prima dalam array:"); // 1 kali eksekusi

        for (int num : bilangan) {
            boolean isPrime = true; // panjang sebuah array = n (15) kali eksekusi

            for (int k = 2; k <= Math.sqrt(num); k++) { // n (15) kali eksekusi
                if (num % k == 0) {
                    isPrime = false; // kemungkinan terburuk = n (15) kali eksekusi
                    break; // kemungkinan terburuk = n (15) kali eksekusi
                }
            }

            if (isPrime) {
                System.out.print(num + " "); // kemungkinan terburuk = n (15) kali eksekusi
            }
        }

        // Algoritma mencari bilangan prima dengan do while
        int[] bilangan2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 1 kali eksekusi
        int l = 0; // 1 kali eksekusi

        System.out.println("\nBilangan prima dalam array:"); // 1 kali eksekusi

        do {
            boolean isPrime = true; // panjang sebuah array = n (15) kali eksekusi

            for (int j = 2; j <= Math.sqrt(bilangan2[l]); j++) { // n (15) kali eksekusi
                if (bilangan2[l] % j == 0) {
                    isPrime = false; // kemungkinan terburuk = n (15) kali eksekusi
                    break; // kemungkinan terburuk = n (15) kali eksekusi
                }
            }

            if (isPrime) {
                System.out.print(bilangan2[l] + " "); // kemungkinan terburuk = n (15) kali eksekusi
            }

            l++; // n (10) kali eksekusi
        } while (l < bilangan2.length); // n (10) kali eksekusi

    }
}
