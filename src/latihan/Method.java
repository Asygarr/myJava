package latihan;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");int nilai = input.nextInt();

        int jumlah = HitungFaktorial(nilai);
        System.out.println("Jumlah Faktorial : "+jumlah);
    }
    private static int HitungFaktorial(int paramater){
        System.out.println("Nilai : "+paramater);

        if (paramater == 1){
            return paramater;
        }

        return paramater * HitungFaktorial(paramater-1);
    }
}
