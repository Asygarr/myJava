package tugas.stackPengurutan;

import java.util.Arrays;
import java.util.Random;

public class stack {

    public static void main(String[] args) {
        Random rand = new Random();
        stackClass toples1 = new stackClass();
        stackClass toples2 = new stackClass();
        stackClass toples3 = new stackClass();
        int piring, temp, top2 = 0, top3 = 0;
        int[] angka = new int[6];
        for (int i = 0; i < 6; i++){
            angka[i] = rand.nextInt(1, 10);
        }

//        int[] angka = {6, 5, 5, 8, 6, 1};
        int n = angka.length;

        // Data awal
        System.out.println("Angka : "+ Arrays.toString(angka));
        System.out.println("Panjang Array : "+ n);

        System.out.println("\n<<<<< Mengeluarkan data dari toples >>>>>");
        for (int i = 0; i < n; i++){
            toples1.push(angka[i]);
        }
        System.out.print("Toples 1 : ");toples1.tampil();
        System.out.println();

        for (int i = 0; i < n; i++){
            piring = toples1.pop();
            if (i == 0) {
                toples2.push(piring);
                top2 = piring;
            } else {
                if (piring < top2) {
                    if (piring < top3) {
                        temp = toples3.pop();
                        toples3.push(piring);
                        if (temp != 0) {
                            toples3.push(temp);
                        }
                        top3 = temp;
                    } else {
                        toples3.push(piring);
                        top3 = piring;
                    }
                } else {
                    toples2.push(piring);
                    top2 = piring;
                }
            }
        }

        System.out.println();
        System.out.print("Toples 2 : "); toples2.tampil();
        System.out.print("\nToples 3 : "); toples3.tampil();

        for (int i = 0; i < angka.length; i++){
            try {
                if (toples2.top() > toples3.top()) {
                    toples1.push(toples2.pop());
                } else {
                    toples1.push(toples3.pop());
                }
            } catch (Exception e) {
                try {
                    toples1.push(toples3.pop());
                } catch (Exception a) {
                    toples1.push(toples2.pop());
                }
            }
        }

        System.out.print("\n\nToples : "); toples1.tampil();
    }
}
