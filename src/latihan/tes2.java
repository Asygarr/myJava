package latihan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class tes2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] teller = new int[3];
        teller[0]=1;
        teller[1]=2;
        teller[2]=3;
        int antrian = 0;
        int menu;
        String[] nama = new String[100];

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        Date date = new Date();
        dateFormat.format(date);

        do {
            antrian+=1;
            int menit = random.nextInt(20);
            System.out.println("=====PILIHAN YANG DI INGINKAN======");
            System.out.println("1. Teller");
            System.out.println("2. Exit");
            System.out.println("");
            System.out.print("Pilihan Layanan===> : ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("=====Selamat Datang Di Bank=====");
                System.out.print(" Masukkan Nama : ");
                nama[menu] = sc.next();
                if (antrian%3==0){
                    System.out.println("\n");
                    System.out.println(date);
                    System.out.println("Nama Costumer : "+nama[menu]);
                    System.out.println("Nomor Antrian : "+antrian);
                    System.out.println("Waktu Antrian : "+menit+" menit ");
                    System.out.println("TELLER");
                    System.out.println("  " + teller[2]);
                    System.out.println("");
                    System.out.println("");
                }else if (antrian%2==0) {
                    System.out.println("\n");
                    System.out.println(date);
                    System.out.println("Nama Costumer : "+nama[menu]);
                    System.out.println("Nomor Antrian : "+antrian);
                    System.out.println("Waktu Antrian : "+menit+" menit ");
                    System.out.println("TELLER");
                    System.out.println("  " + teller[1]);
                    System.out.println("");
                    System.out.println("");
                } else {
                    System.out.println("\n");
                    System.out.println(date);
                    System.out.println("Nama Costumer : "+nama[menu]);
                    System.out.println("Nomor Antrian : "+antrian);
                    System.out.println("Waktu Antrian : "+menit+" menit ");
                    System.out.println("TELLER");
                    System.out.println("  " + teller[0]);
                    System.out.println("");
                    System.out.println("");
                }
            } else if (menu==2){
                break;
            }
        } while (true);
    }
}
