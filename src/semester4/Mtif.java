package semester4;

import java.math.BigInteger;
import java.util.Scanner;

public class Mtif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long e = 17;
        long d = 985;
        long n = 2491;

        long[] ascii = new long[26];
        long[] cipertext = new long[26];
        long[] deskripsi = new long[26];

        for (int i = 0; i < ascii.length; i++) {
            ascii[i] = input.nextLong();
        }

        System.out.println("\nHasil Cipertext : ");

        for (int i = 0; i < ascii.length; i++) {
            BigInteger pangkat = BigInteger.valueOf(ascii[i]).pow((int) e);
            cipertext[i] = pangkat.mod(BigInteger.valueOf(n)).longValue();
            System.out.println((i + 1) + ". " + cipertext[i]);
        }

        System.out.println("\nHasil Deskripsi : ");

        for (int i = 0; i < ascii.length; i++) {
            BigInteger pangkat = BigInteger.valueOf(cipertext[i]).pow((int) d);
            deskripsi[i] = pangkat.mod(BigInteger.valueOf(n)).longValue();
            System.out.println((i + 1) + ". " + deskripsi[i]);
        }
    }
}
