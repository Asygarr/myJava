package latihan;

import java.util.Scanner;

public class LatihanMethood {

    public static void main(String[] args){

        do {
            Scanner a = new Scanner(System.in);
            System.out.print("Masukkan nilai panjang = ");
            int p = a.nextInt();
            System.out.print("Masukkan nilai lebar = ");
            int l = a.nextInt();
            Tampilan(p, l);
            if (MenghitungKeliling(p,l)>=200){
                break;
            }else if (MenghitungLuas(p,l)>=200){
                break;
            }
        } while (true);

    }
    private static void Tampilan (int p, int l){
        gambar(p,l);
        System.out.println("luas = "+MenghitungLuas(p,l));
        System.out.println("Keliling = "+MenghitungKeliling(p,l));
    }

    private static int MenghitungKeliling (int p, int l){

        return (p + l)*2;
    }

    private static int MenghitungLuas (int p, int l){

        return p * l;
    }

    private static void gambar (int p, int l){
        for (int i = 0; i < p; i++){
            for (int j = 0; j < l; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
