package latihan;

public class tes {
    public static void main(String[] args) {
        for (int i = 0; i <= 3000; i++){
            System.out.println("I love tou");
        }

//        int[] arr = new int[2];
//        for(int i=0; i < arr.length; i++){
//            System.out.print("hai ");
//        }

//        for (int var1 = 0; var1 < 2; var1++) {
//            for (int var2 = 0; var2 <= 2; var2++) {
//                if (var2 == 2) {
//                    continue;
//                }
//                System.out.println("var1:" + var1 + ", var2:" + var2);
//            }
//        }


        /*
        String name = "Java";
        String language = "Programming";
        String fullName = name + language;
        boolean test = fullName.equals(name + language);
        System.out.println(test);
        */

//        char ch ='c';
//        switch(ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Vowels");
//                break;
//            default:
//                System.out.println("Consonants");
//        }

//        Random random = new Random();
//        int kostumer = random.nextInt(10);
//        int[] menit=new int[100];
//        Scanner sc = new Scanner(System.in);
//        int teller = 0;
//        int antrian = 0;
//        int menu;
//        String[] nama = new String[100];
//
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
//        Date date = new Date();
//        dateFormat.format(date);
//
//        for (int i = 1; i <= kostumer; i++){
//            antrian+=1;
//            menit[antrian] = random.nextInt(30);
//                System.out.println("=====PILIHAN YANG DI INGINKAN======");
//                System.out.println("1. Teller");
//                System.out.println("2. Exit");
//                System.out.println("");
//                System.out.print("Pilihan Layanan===> : ");
//                menu = sc.nextInt();
//
//                    if (menu == 1) {
//                        if (antrian==1){
//                            teller = 1;
//                        } if (antrian==2){
//                            teller = 2;
//                        } if (antrian > 2){
//                            if (menit[antrian]>menit[1]){
//                                teller = 1;
//                            } else {
//                                teller = 2;
//                            }
//                        }
//
//                        System.out.println("=====Selamat Datang Di Bank=====");
//                        System.out.print(" Masukkan Nama : ");
//                        nama[menu] = sc.next();
//                        System.out.println("\n");
//                        System.out.println(date);
//                        System.out.println("Nama Costumer : " + nama[menu]);
//                        System.out.println("Nomor Antrian : " + antrian);
//                        System.out.println("Waktu Antrian : " + menit[antrian] + " menit ");
//                        System.out.println("TELLER");
//                        System.out.println("  " + teller);
//                        System.out.println("");
//                        System.out.println("");
//
//                    } else if (menu == 2) {
//                        break;
//                    }
//        }
    }
}
