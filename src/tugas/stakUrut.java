package tugas;

import java.util.Arrays;

public class stakUrut {
    public static void main(String[] args) {
        classStack toples1 = new classStack();
        classStack toples2 = new classStack();
        classStack toples3 = new classStack();
        int piring, temp, top2 = 0, top3 = 0;

        int[] angka = {6, 5, 2, 4, 1, 3};
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

class classStack{
    int[] stack = new int[2000];//isi Stack harus dalam bentuk Tipe Array
    int top; //deklarasi variabel top

    public void push (int angka) {
        stack[top]=angka;//itu yang tadi dari Classs utama saya ambilki baru saya taro' diposisi paling atas yang disebut top
        top= top+1;// bertambah mi topnya 12
    }
    public int pop () {
        int data;//sediakan 1 variabel untuk menampung data yang dikeluarkan dari Stack
        top--;// kurangi top terlebih dahulu
        data = stack[top];//keluarkan isi top dan masukkan ke dalam variabel data
        return data;
    }

    public void tampil() {
        for(int i = top-1;i>=0;i--) { //input menggunakan looping
            System.out.print(stack[i]+" ");
        }
    }

    public int top() {
        return stack[top-1];
    }
}
