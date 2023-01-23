package latihan;

public class looping {
    public static void main(String[] args){

        char huruf = 65;
        for (int i = 1; i <= 4; i ++){
            for (int j = 1; j <= 4; j++){
                System.out.print(huruf++ + " ");
            }
            System.out.println();
        }

        //mencari nilai terbesar
//        Scanner n = new Scanner(System.in);
//        int m=0,k=1000;
//        for (int i = 1; i<=5; i++){
//            System.out.print("Angka : ");
//            int angka = n.nextInt();
//            if (angka>m){
//                m=angka;
//            }
//            if (angka<k){
//                k=angka;
//            }
//        }
//        System.out.println("kecil : "+k);
//        System.out.println("besar : "+m);
//
//
//        //mencari nilai rata-rata
//        int total=0, jumlah=100, nilaiawal=0, rata=0;
//        for (nilaiawal = 0; nilaiawal <= jumlah; nilaiawal++){
//            total=nilaiawal+total;
//            rata= (total/jumlah);
//            System.out.println(total);
//        }
//        System.out.println("Rata rata "+rata);


        //n^n
//        int a = 1;
//        for (int i = 0; i<=100; i++){
//            a *= 3;
//            System.out.println("Pengulangan : "+a);
//        }

//        int i = 1, nilai_awal=0;
//        while (nilai_awal<=100){
//            System.out.println("Pengulangan : "+i);
//            i*=3;
//        }
    }
}
