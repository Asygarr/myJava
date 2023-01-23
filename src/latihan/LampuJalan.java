package latihan;

import java.util.Random;

public class LampuJalan {
    public static void main(String[] args) {
        Random random = new Random();
        String mobil;
        int detik=30, jam = 0;
        double[] menit=new double[4];
        int[] mobilRandom = new int[4];


        System.out.println("=======PROGRAM LAMPU JALAN=======");
        for (int i = 1; i <= 30; i++){
            mobilRandom[0]=random.nextInt(10);
            mobilRandom[1]=random.nextInt(10);
            mobilRandom[2]=random.nextInt(10);
            mobilRandom[3]=random.nextInt(10);

            if(i <= detik){
                menit[0]= (double) detik/60;
                jam=(int) menit[0]/60;
                System.out.println("* LAMPU 1 HIJAU *");
                System.out.println("* Lampu 2 , 3 , 4 merah *");
                System.out.println("Rentang waktu lampu 1 menyala : " + menit[3] +" - "+ menit[0] +" Menit\n");

                if (mobilRandom[0] == 0){
                    System.out.println("Tidak ada mobil melintas!");
                } else {
                    for (int j = 1; j <= mobilRandom[0]; j++) {
                        int arah = random.nextInt(3);
                        mobil = "Mobil " + j;
                        if (arah == 0) {
                            System.out.println(mobil + " Belok Kiri, Dari Jalur B ke C");
                        } else if (arah == 1) {
                            System.out.println(mobil + " Jalan Lurus, Dari Jalur B ke E");
                        } else {
                            System.out.println(mobil + " Belok Kanan, Dari Jalur B ke G");
                        }
                    }
                }
                detik+=30;
                System.out.println();
                System.out.println("===========================================\n");
            }

            if(i <= detik){
                menit[1] = (double) detik/60;
                jam=(int) menit[1]/60;
                System.out.println("* LAMPU 2 HIJAU *");
                System.out.println("* Lampu 1 , 3 , 4 merah *");
                System.out.println("Rentang waktu lampu 2 menyala : " + menit[0] +" - "+ menit[1] +" Menit\n");

                if (mobilRandom[1] == 0){
                    System.out.println("Tidak ada mobil melintas!");
                } else {
                    for (int j = 1; j <= mobilRandom[1]; j++) {
                        int arah = random.nextInt(3);
                        mobil = "Mobil " + j;
                        if (arah == 0) {
                            System.out.println(mobil + " Belok Kiri, Dari Jalur D ke E");
                        } else if (arah == 1) {
                            System.out.println(mobil + " Jalan Lurus, Dari Jalur D ke G");
                        } else {
                            System.out.println(mobil + " Belok Kanan, Dari Jalur D ke A");
                        }
                    }
                }
                detik+=30;
                System.out.println();
                System.out.println("===========================================\n");
            }

            if(i <= detik){
                menit[2] = (double) detik/60;
                jam=(int) menit[2]/60;
                System.out.println("* LAMPU 3 HIJAU *");
                System.out.println("* Lampu 1 , 2 , 4 merah *");
                System.out.println("Rentang waktu lampu 3 menyala : " + menit[1] +" - "+ menit[2] +" Menit\n");

                if (mobilRandom[2] == 0){
                    System.out.println("Tidak ada mobil melintas!");
                } else {
                    for (int j = 1; j <= mobilRandom[2]; j++) {
                        int arah = random.nextInt(3);
                        mobil = "Mobil " + j;
                        if (arah == 0) {
                            System.out.println(mobil + " Belok Kiri, Dari Jalur F ke G");
                        } else if (arah == 1) {
                            System.out.println(mobil + " Jalan Lurus, Dari Jalur F ke A");
                        } else {
                            System.out.println(mobil + " Belok Kanan, Dari Jalur F ke C");
                        }
                    }
                }
                detik+=30;
                System.out.println();
                System.out.println("===========================================\n");
            }

            if(i <= detik){
                menit[3] = (double) detik/60;
                jam=(int) menit[3]/60;
                System.out.println("* LAMPU 4 HIJAU *");
                System.out.println("* Lampu 1 , 2 , 3 merah *");
                System.out.println("Rentang waktu lampu 4 menyala : " + menit[2] +" - "+ menit[3] +" Menit\n");

                if (mobilRandom[3] == 0){
                    System.out.println("Tidak ada mobil melintas!");
                } else {
                    for (int j = 1; j <= mobilRandom[3]; j++) {
                        int arah = random.nextInt(3);
                        mobil = "Mobil " + j;
                        if (arah == 0) {
                            System.out.println(mobil + " Belok Kiri, Dari Jalur H ke A");
                        } else if (arah == 1) {
                            System.out.println(mobil + " Jalan Lurus, Dari Jalur H ke C");
                        } else {
                            System.out.println(mobil + " Belok Kanan, Dari Jalur H ke E");
                        }
                    }
                }
                detik+=30;
                System.out.println();
                System.out.println("===========================================\n");
            }
        }
        if(menit[3]>=60) {
            System.out.println("Waktu lampu jalan menyala : " + jam + " Jam");
        } else {
            System.out.println("Waktu lampu jalan menyala : " + menit[3] + " Menit");
        }
    }
}