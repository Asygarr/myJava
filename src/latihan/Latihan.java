package latihan;

public class Latihan {

    public static void main(String[] args) {




//        LocalTime waktu = LocalTime.now();
//        System.out.println(waktu.format(DateTimeFormatter.ofPattern("hh:mm:ss a\n")));

//            System.out.print("Jumlah anak : ");jumlah_anak[k]= input.nextInt();
//            for (int i=1;i<=jumlah_anak[k];i++){
//                System.out.print("Usia anak ke "+i+": ");usia_anak[k]=input.nextInt();
//                if (usia_anak[k]<tanggungan[k]){
//                    totalTJanak[k]+=1;
//                }
//            }

//            if (departemen[k].equalsIgnoreCase("Kuangan")){
//                tad1+=jumlah_anak[k];
//            } else if (departemen[k].equalsIgnoreCase("Tenaga Kerja")){
//                tad2+=jumlah_anak[k];
//            } else if (departemen[k].equalsIgnoreCase("Kesehatan")){
//                tad3+=jumlah_anak[k];
//            }

        for (int i=1;i<=7;i++){
            for (int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


//        int k=4;
//        for (int i=1; i<=7; i++){
//            if (i<=3){
//                for (int j=1; j<=k; j++){
//                    System.out.print("* ");
//                }
//                k--;
//            } if (i>=4){
//                for (int j=1; j<=k; j++){
//                    System.out.print("* ");
//                }
//                k++;
//            }
//            System.out.println(" ");
//        }

//        Scanner input = new Scanner(System.in);
//        int i =0;
//        do {
//            i++;
//            System.out.print("Masukkan Nilai : ");String nilai = input.nextLine();
//            System.out.print("Masukkan N : ");String n = input.nextLine();
//        } while (i<=3);




//        int total=0, jumlah=100, nilaiawal=0, rata=0;
//        for (nilaiawal = 0; nilaiawal <= jumlah; nilaiawal++){
//            total=nilaiawal+total;
//            rata= (total/jumlah);
//            System.out.println(total);
//        }
//        System.out.println("Rata rata "+rata);

//        int total=4, n=5;
//        for (int i = 1; i<=n; i++){
//            total*=n;
//            System.out.println(total);
//        }

//        for (int i = 1; i<=n; i++){
//            total*=m;
//            System.out.println(m);
//        }

//        int total = 1, n=6;
//        for (int i=1; i<=n; i++){
//            total*=i;
//            System.out.println(total);
//        }

//        for (nilaiawal=0;nilaiawal<=jumlah;nilaiawal++){
//            total+=nilaiawal;
//            System.out.println(total);
//        }

//        int awal=0, tambah=0, akhir=0;
//        do {
//            awal++;
//            tambah=awal+tambah;
//            System.out.println(tambah);
//            if (awal==100){
//                break;
//            }
//        } while (true);
//
//        int na=0,tbh=0, nak=100;
//        while (na<=nak){
//            tbh= na+tbh;
//            na++;
//            System.out.println(tbh);
//        }



//        int a,b,c = 0;
//        b=100;
//        for (a=0;c<=b;c++){
//            a=a+c;
//            System.out.println(a);
//        }

//        int i = 0;
//        while (i<=10){
//            i++;
//            System.out.println("1 cangkir kopi = "+i);
//        }
//
//        int a = 0;
//        do {
//            a=a+2;
//            if (a == 2000){
//                System.out.println("Cek menit "+a+" : Jemuran sudah kering");
//                break;
//            }else {
//                System.out.println("Cek menit "+a+" : Jemuran masih basah");
//            }
//        } while (true);
//
//        for (int p = 1; p<=10; p++){
//            System.out.println("Proses "+p+" : 1 cangkir kopi "+p);
//        }


//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if((i+j)<4 || (4+i)==j || (3+i)==j || (i+j)>8 ||
//                        (4+j)==i || (3+j)==i ){
//                    System.out.print(" ");
//                } else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }

        //fibonacci
//        int fn,fn1,fn2,n,i;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan Nilai awal = ");
//        i = sc.nextInt();
//        System.out.print("Masukkan Nilai akhir = ");
//        n = sc.nextInt();
//        fn2=0;
//        fn1=1;
//        fn=1;

//        do {
//            System.out.println("Nilai ke n "+i+" adalah "+fn);
//            i++;
//            fn=fn1+fn2;
//            fn2=fn1;
//            fn1=fn;
//        }while (i<=n);

//        i=1;
//        while (i<=n){
//            System.out.println("Nilai ke n "+i+" adalah "+fn);
//            i++;
//            fn=fn2+fn1;//fn=1
//            fn2=fn1;//fn2=1
//            fn1=fn;//fn1=1
//        }

        //looping
//        int a,b,t;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("masukkan nilai awal = ");
//        a = sc.nextInt();
//        System.out.print("masukkan nilai akhir = ");
//        b = sc.nextInt();
//
//        for (t=0; (a<=b); a++){
//            t = t + a;
//            System.out.println("Ditambah "+a+" mrnjadi "+t);
//        }
//
//        t=0;
//        do {
//            t = t+a;
//            System.out.println("Ditambah "+a+" mrnjadi "+t);
//            a++;
//        }while (a<=b);


//        t=0;
//        while (a<=b){
//            t = t + a;
//            System.out.println("Ditambah "+a+" mrnjadi "+t);
//            a++;
//        }

//        for (int i=0; (i<=300); i++){
//            System.out.println("Kak adakah THR?");
//        }


//        int i = 0;
//        boolean kondisi = true;
//
//        do {
//            i++;
//            System.out.println(i);
//            if (i==200){
//                kondisi=false;
//            }
//        }while (true);




//        int i=0;
//        boolean kondisi = true;
//
//        while (kondisi){
//            System.out.println(i);
//            i++;
//            if (i == 11){
//                kondisi=false;
//            }
//        }





//        // operator ternary
//        int a;
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("masukkan nilai = ");
//        a = input.nextInt();
//
//        int x = (a > 10) ? (a*10) : (a*5);
//        System.out.println("hasil = "+x);

    }
}
